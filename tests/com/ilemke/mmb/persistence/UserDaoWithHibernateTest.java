package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.User;
import org.junit.Test;

//import javax.ejb.TransactionAttribute;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Isaac on 4/16/2016.
 */
public class UserDaoWithHibernateTest
{
    @Test
    public void myUnitTest()
    {
        UserDaoWithHibernate dao = new UserDaoWithHibernate();
        int initial_size = dao.getAllUsers().size();

        // Creating the new user
        int insertedUserId = 0;
        User user = new User();
        user.setFirstName("FirstNameTest");
        user.setLastName("LastNameTest");
        user.setEmailAddress("UnitTest@Test.com");
        user.setPassword("password");
        user.setId(0);
        insertedUserId = dao.addUser(user);

        // Check if user was actually added
        assertTrue(insertedUserId > 0);
        int after_insert_size = dao.getAllUsers().size();
        System.out.println("Before: " + initial_size + " After: " + after_insert_size);
        assertTrue(after_insert_size == initial_size + 1);

        // Attempt to delete a user
        dao.deleteUser(user);

        // Check if user was actually deleted
        int after_delete_size = dao.getAllUsers().size();
        System.out.println("After Delete: " + after_delete_size);
        assertTrue(after_delete_size == initial_size);


    }



}
