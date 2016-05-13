package com.ilemke.mmb.persistence;

import com.ilemke.mmb.entity.Brain;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Isaac on 5/7/2016.
 *
 * Class purpose is to test functionality related to
 * adding and deleting brain records.
 *
 */
public class BrainDaoTest {
    @Test
    public void testGetAllBrains() throws Exception {
        // See if brain record quantity can be received
        BrainDao dao = new BrainDao();
        int initial_size = dao.getAllBrains().size();
        assertNotNull(initial_size);
    }

    @Test
    public void testAddBrain() throws Exception {

        // Create a new Brain data entry
        BrainDao dao = new BrainDao();
        int insertedBrainId = 0;

        Brain brain = new Brain();
        brain.setSerialData("test serial input");
        brain.setId(1);
        System.out.println(brain);
        insertedBrainId = dao.addBrain(brain);
    }

    @Test
    public void testDeleteBrain() throws Exception {

        // Create a new Brain data entry
        BrainDao dao = new BrainDao();
        int brains_initial_size = dao.getAllBrains().size();
        int insertedBrainId = 0;
        Brain brain = new Brain();
        brain.setSerialData("test serial input");
        brain.setId(1);
        insertedBrainId = dao.addBrain(brain);
        int brains_after_create = dao.getAllBrains().size();

        // Make sure brain has actually been inserted
        assertTrue(brains_after_create == brains_initial_size + 1);

        // Attempt to delete a brain entry
        dao.deleteBrain(brain);
        int brains_after_delete = dao.getAllBrains().size();

        // Test to see if brain has been deleted
        assertTrue(brains_after_delete == brains_initial_size);
    }

}
