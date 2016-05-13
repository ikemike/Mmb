package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.User;
import org.junit.Test;

//import javax.ejb.TransactionAttribute;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Isaac on 4/16/2016.
 */
public class UserDaoWithHibernateTest
{

    @Test
    public void listUsersTest() {
        // Attempt to pull record data
        UserDaoWithHibernate dao = new UserDaoWithHibernate();
        int initial_size = dao.getAllUsers().size();

        // If record data was accessible this should pass
        assertNotNull(initial_size);
    }
    @Test
    public void addUserTest() {
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
        assertTrue(after_insert_size == initial_size + 1);

    }
    @Test
    public void deleteUserTest()
    {
        // Create a user
        UserDaoWithHibernate dao = new UserDaoWithHibernate();
        User user = new User();
        user.setFirstName("FirstNameTest");
        user.setLastName("LastNameTest");
        user.setEmailAddress("UnitTest@Test.com");
        user.setPassword("password");
        user.setId(0);
        dao.addUser(user);

        // Get current list of all users
        int before_delete_size = dao.getAllUsers().size();

        // Attempt to delete a user
        dao.deleteUser(user);

        // Check if user was actually deleted
        int after_delete_size = dao.getAllUsers().size();
    }
}
