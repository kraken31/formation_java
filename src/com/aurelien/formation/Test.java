package com.aurelien.formation;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Test {
    public static void main(String[] args) {
        FileInputStream fis;
        BufferedInputStream bis;
        FileChannel fc;

        try {
            fis = new FileInputStream(new File("dictionnaire.txt"));
            bis = new BufferedInputStream(fis);
            long time = System.currentTimeMillis();
            while (bis.read() != -1);
            System.out.println("temps d'exécution avec un buffer conventionnel : " + (System.currentTimeMillis() - time));

            fis = new FileInputStream(new File("dictionnaire.txt"));
            fc = fis.getChannel();
            int size = (int)fc.size();
            ByteBuffer bBuff = ByteBuffer.allocate(size);
            time = System.currentTimeMillis();
            fc.read(bBuff);
            bBuff.flip();
            System.out.println("Temps d'exécution avec un nouveau buffer : " + (System.currentTimeMillis() - time));

            byte[] tabByte = bBuff.array();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
