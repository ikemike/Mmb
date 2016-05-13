package com.ilemke.mmb.controller;

import com.ilemke.mmb.entity.Brain;
import com.ilemke.mmb.entity.User;
import com.ilemke.mmb.persistence.BrainDao;
import com.ilemke.mmb.persistence.UserDaoWithHibernate;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by Isaac on 5/9/2016.
 */
@WebServlet(name="WatchServlet", urlPatterns = { "/watchservlet" })
public class WatchServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Servlet watches boolean of session variable in order
     * to stop the Receiver.
     *
     * @param req  - The HTTP request object
     * @param resp - the HTTP response object
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
/*
        Receiver receiver = new Receiver();
        while (req.getParameter("status").equals("start")) {
            try {
                //receiver.start();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (req.getParameter("status").equals("stop")) {

                //String url = "/restricted/viewBrain.jsp";
                //resp.sendRedirect(url);
                break;
            }
        }
        if (req.getParameter("status").equals("stop")) {

            //String url = "/restricted/viewBrain.jsp";
            //resp.sendRedirect(url);

        }
*/
    }
}


