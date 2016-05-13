package com.ilemke.mmb.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by Isaac on 5/12/2016.
 */

/**
 * PropertiesServlet loads properties file
 */
public class PropertiesServlet extends HttpServlet {

    private Properties properties;

    /**
     * Loads resource properties from mmb.properties file -
     * defined in WEB-INF/web.xml
     * @throws ServletException
     */
    @Override
    public void init() throws ServletException {

        try {
            String path = getServletContext().getInitParameter("properties");
            final InputStream is = getServletContext().getResourceAsStream(path);
            try {
                properties.load(is);
            } finally {
                is.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

