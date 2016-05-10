package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.Brain;
import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Isaac on 5/7/2016.
 */
public class BrainDao {

    private final Logger log = Logger.getLogger(this.getClass());

    /**
     * Method gathers a list of all current Brain
     * records in database and returns them
     * @return brains - A list of brain records
     */
    public List<Brain> getAllBrains() {
        List<Brain> brains = new ArrayList<Brain>();
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        brains = session.createCriteria(Brain.class).addOrder(Order.desc("id")).list();
        return brains;
    }

    /**
     * Method addBrain accepts a new Brain object
     * to be added and inserts this record into the database.
     * @param brain - The brain object to be inserted
     * @return brainId - The new record's ID
     */
    public int addBrain(Brain brain) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer brainId = null;

        try {
            tx = session.beginTransaction();
            brainId = (Integer) session.save(brain);
            tx.commit();
            log.info("BRAIN ADDED! Id: " + brainId + " Object: " + brain);
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
        return brainId;
    }

    /**
     * Method deleteBrain accepts a brain object to
     * be removed from the database.
     * @param brain - The brain object to remove
     */
    public void deleteBrain(Brain brain) {
        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer brainId = null;
        try {
            tx = session.beginTransaction();
            session.delete(brain);
            tx.commit();
            log.info("BRAIN DELETED! : " + brain);
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            log.error(e);
        } finally {
            session.close();
        }
    }


}
