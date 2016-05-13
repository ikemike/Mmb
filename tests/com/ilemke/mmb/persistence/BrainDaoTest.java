package com.ilemke.mmb.persistence;


import com.ilemke.mmb.entity.Brain;
import org.junit.Test;

import java.util.List;

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
        BrainDao dao = new BrainDao();
        int initial_size = dao.getAllBrains().size();
        List<Brain> brainList = dao.getAllBrains();
    }

    @Test
    public void testAddBrain() throws Exception {

        // Create a new Brain data entry
        BrainDao dao = new BrainDao();
        int insertedBrainId = 50000;

        Brain brain = new Brain();
        brain.setSerialData("test serial input");
        brain.setId(999999);
        insertedBrainId = dao.addBrain(brain);



    }

    @Test
    public void testDeleteBrain() throws Exception {

    }

}
