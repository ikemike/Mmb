package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.User;
import java.util.List;
/**
 * Created by Isaac on 4/16/2016.
 */
public interface UserDao {

    /**
     * Return a list of all users
     * @return all users */
    public List<User> getAllUsers();

    /**
     * Update a user
     * @param user to be updated
     */
    public void updateUser(User user);

    /**
     * Delete a user
     * @param user to be deleted
     */
    public void deleteUser(User user);

    /**
    * Add a user
     * @param user to be added
     * @return id (int) of the new user
     */
    public int addUser(User user);


}
