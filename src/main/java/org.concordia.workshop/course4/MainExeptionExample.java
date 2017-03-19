package org.concordia.workshop.course4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by caoc on 3/11/17.
 * Copyright (c) 2015 Service ECVictor Inc. All rights reserved.
 */

public class MainExeptionExample {
    private static final String FILENAME = "E:\\test\\filename.txt";

    public static void main(String[] args) {

        BufferedReader br = null;
        FileReader fr = null;

        try {

            fr = new FileReader(FILENAME);
            br = new BufferedReader(fr);

            String sCurrentLine;

            br = new BufferedReader(new FileReader(FILENAME));

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
            }

        } catch (IOException e) {

          throw new MyNewException("My expection");

        } finally {

            try {

                if (br != null)
                    br.close();

                if (fr != null)
                    fr.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }

    }

}
