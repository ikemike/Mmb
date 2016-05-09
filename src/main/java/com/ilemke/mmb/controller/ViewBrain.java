package com.ilemke.mmb.controller;

import com.ilemke.mmb.entity.Brain;
import com.ilemke.mmb.persistence.BrainDao;
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
 * Created by Isaac on 5/7/2016.
 */


@WebServlet(name="viewBrain", urlPatterns = { "/restricted/viewBrain" })
/**
 * Servlet ViewBrain
 */
public class ViewBrain extends HttpServlet  {
    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Method returns brain serial data entries
     * @param req - The HTTP request object
     * @param resp - the HTTP response object
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException {

        BrainDao dao = new BrainDao();

        List<Brain> brains = dao.getAllBrains();
        System.out.println(brains);

        //req.setAttribute("brains",dao.getAllBrains()); //?? had setAttribute.("brain", dao.get(1))
        log.debug("Sending all brain info");

        HttpSession session = req.getSession();
        session.setAttribute("brains", brains);
        String url = "/restricted/viewBrain.jsp";
        resp.sendRedirect(url);
        //RequestDispatcher dispatcher = req.getRequestDispatcher("/viewBrain.jsp");
        //dispatcher.forward(req, resp);

    }
}
