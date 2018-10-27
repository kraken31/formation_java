package com.aurelien.formation;

import java.io.*;


public class Test {
    public static void main(String[] args) {
        File file = new File("testFileWriter.txt");
        FileWriter fw;
        FileReader fr;

        try {
            fw = new FileWriter(file);
            String str = "Bonjour à tous, amis Zéros !\n";
            str += "\tComment allez-vous ?\n";
            fw.write(str);
            fw.close();

            fr = new FileReader(file);
            str = "";
            int i = 0;
            while ((i = fr.read()) != -1)
                str += (char) i;

            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
