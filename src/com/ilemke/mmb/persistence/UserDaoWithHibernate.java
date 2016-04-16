package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.User;
import org.apache.log4j.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.annotations.common.util.impl.Log;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
/**
 * DAO Implementation
 * Created by Isaac on 4/16/2016.
 */
public class UserDaoWithHibernate implements UserDao
{

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Returns a list of all User objects
     * @Override
     */
    @Override
    public List<User> getAllUsers()
    {
        List<User> users = new ArrayList<User>();

        /* Create a SessionFactory by calling the SessionFactoryProvider */
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        users = session.createCriteria(User.class).list();
        return users;
    }

    @Override
    public void updateUser(User user)
    {

    }

    @Override
    public void deleteUser(User user)
    {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;

        /* Try to initiate a new connection to the database and delete a user */
        try
        {
            tx = session.beginTransaction();

            session.delete(user);
            session.flush();
            // session.save(createUserRole(user)); give the user a user role
            log.info("User was deleted: " + user + " id = " + userId);
        }
        /* Catch hibernate exception, output error message */
        catch (HibernateException e)
        {
            if (tx != null)
            {
                tx.rollback();
            }
            log.error(e);
        }
        finally
        {
            session.close();
        }
    }

    @Override
    public int addUser(User user)
    {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;

        /* Try to initiate a new connection to the database and insert the new user */
        try
        {
            tx = session.beginTransaction();
            userId = (Integer) session.save(user);
            // session.save(createUserRole(user)); give the user a user role
            tx.commit();
            log.info("New user added: " + user + " id = " + userId);
        }
        /* Catch hibernate exception, output error message */
        catch (HibernateException e)
        {
            if (tx != null)
            {
                tx.rollback();
            }
            log.error(e);
        }
        finally
        {
            session.close();
        }
        return userId;
    }

    /* Adding Roles:
    private UsersRoles createUserRole(User user)
    {

        UsersRoles usersRoles = new UsersRoles();
        usersRoles.setEmailAddress(user.getEmailAddress());
        usersRoles.setRole("user");
        return usersRoles;
    }
    */

}
