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
<<<<<<< HEAD
     *
     * @throws IOException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws IOException, InterruptedException {
=======
     * Processing class to log entries from arduino serial output
     * @throws IOException
     * @throws InterruptedException
     */
    public void startReceiver() throws IOException, InterruptedException {

>>>>>>> 1cd7b66f67e6033c20a4b4fabc4346a018f47619
        FileInputStream fis = null;
        for (int i = 0; i < 90; i++) {
            try {

<<<<<<< HEAD
                //FileInputStream in = new FileInputStream("B:/MadJavaGitHubFiles/Mmb/src/main/resources/demoCapture.txt");
                FileInputStream in = new FileInputStream("C:/Users/Ike/IdeaProjects/maps/Mmb/resources/BrainData.asc");
=======
                // Ideally this is going to use the path specified in the properties file
                FileInputStream in = new FileInputStream("../Mmb/src/main/resources/demoCapture.txt");
>>>>>>> 1cd7b66f67e6033c20a4b4fabc4346a018f47619
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
            }
            Thread.sleep(1005);
        }
    }

}
