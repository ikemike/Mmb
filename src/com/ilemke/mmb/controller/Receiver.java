package com.ilemke.mmb.controller;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Isaac on 5/7/2016.
 */
public class Receiver {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;

        try {
            System.out.println("test");
            FileInputStream in = new FileInputStream("B://MadJavaGitHubFiles/Mmb/src/com/ilemke/mmb/controller/demoCapture.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(in));

            String strLine = null, tmp;

            while ((tmp = br.readLine()) != null) {
                strLine = tmp;
            }

            String lastLine = strLine;

            System.out.println(lastLine);

            in.close();
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void randomread() {

    }
}
