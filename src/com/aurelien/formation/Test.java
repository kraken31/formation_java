package com.aurelien.formation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(new File("test.txt"));
            fos = new FileOutputStream(new File("test2.txt"));

            byte[] buf = new byte[8];
            int n = 0;

            while ((n = fis.read(buf)) >= 0) {
                fos.write(buf);

                for (byte bit : buf) {
                    System.out.print("\t" + bit + "(" + (char) bit + ")");
                }
                System.out.println("");
                buf = new byte[8];
            }
            System.out.println("Copie terminée !");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
