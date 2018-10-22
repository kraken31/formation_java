package com.aurelien.formation;

import java.io.*;


public class Test {
    public static void main(String[] args) {
        FileInputStream fis;
        FileOutputStream fos;
        BufferedInputStream bis;
        BufferedOutputStream bos;

        try {
            fis = new FileInputStream(new File("test.txt"));
            fos = new FileOutputStream(new File("test2.txt"));
            bis = new BufferedInputStream(new FileInputStream(new File("test.txt")));
            bos = new BufferedOutputStream(new FileOutputStream(new File("test3.txt")));
            byte[] buf = new byte[8];

            long startTime = System.currentTimeMillis();

            while (fis.read(buf) != -1){
                fos.write(buf);
            }
            System.out.println("Temps de lecture + écriture avec FileInputStream et FileOutputStream : " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();

            while (bis.read(buf) != -1) {
                bos.write(buf);
            }

            System.out.println("Temps de lecture + écriture avec BufferedInputStream et BufferedOutputStream : " + (System.currentTimeMillis() - startTime));

            fis.close();
            bis.close();
            fos.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
