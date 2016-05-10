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
@WebServlet(name="SignupServlet", urlPatterns = { "/signup" })
public class SignupServlet extends HttpServlet {

    private final Logger log = Logger.getLogger(this.getClass());


    /**
     * Servlet performs database entry for creating a new user
     * @param req - The HTTP request object
     * @param resp - the HTTP response object
     * @throws ServletException
     * @throws IOException
     */

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Receive parameters from request
        String username = req.getParameter("inputUsername");
        String password = req.getParameter("inputPassword");
        String firstname = req.getParameter("inputFirstname");
        String lastname = req.getParameter("inputLastname");

        // Create a user object out of received parameters
        User user = new User();
        user.setEmailAddress(username);
        user.setPassword(password);
        user.setFirstName(firstname);
        user.setLastName(lastname);

        // Instantiate a dao to do database activity
        UserDaoWithHibernate dao = new UserDaoWithHibernate();

        // Call dao create user action
        dao.addUser(user);

        String url = "restricted/login-user.jsp";
        resp.sendRedirect(url);

    }
}