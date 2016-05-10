package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.User;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * Created by Isaac on 5/9/2016.
 */
public class UserRolesDao {

    private final Logger log = Logger.getLogger(this.getClass());

    public void insertUserRole(User user) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer userId = null;
        try
        {
            tx = session.beginTransaction();
            userId = (Integer) session.save(user);
            // session.save(createUserRole(user)); give the user a user role
            tx.commit();

            //log.info("User with role was inserted: " + user_role);
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
}
