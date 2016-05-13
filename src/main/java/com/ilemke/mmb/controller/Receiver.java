package com.ilemke.mmb.controller;

import com.ilemke.mmb.entity.Brain;
import com.ilemke.mmb.persistence.BrainDao;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Isaac on 5/7/2016.
 */
public class Receiver {

    /**
     * Processing class to log entries from arduino serial output
     * @throws IOException
     * @throws InterruptedException
     */
    public void startReceiver() throws IOException, InterruptedException {

        FileInputStream fis = null;
        for (int i = 0; i < 90; i++) {
            try {

                // Ideally this is going to use the path specified in the properties file
                FileInputStream in = new FileInputStream("../Mmb/src/main/resources/demoCapture.txt");
                BufferedReader br = new BufferedReader(new InputStreamReader(in));

                String strLine = null, tmp;

                while ((tmp = br.readLine()) != null) {
                    strLine = tmp;
                }

                String lastLine = strLine;

            /* Write a new entry to the database */
                BrainDao dao = new BrainDao();
                Brain brain = new Brain();
                brain.setSerialData(lastLine);
                dao.addBrain(brain);
                in.close();

            } catch (Exception e) {
                System.out.println(e);
            }
            Thread.sleep(1050);
        }
    }

}
