package com.aurelien.formation;

import java.io.*;


public class Test {
    public static void main(String[] args) {
        StringWriter sw = new StringWriter();
        StringReader sr;

        try {
            sw.write("Coucou les Zéros");
            System.out.println(sw);
            sw.close();

            sr = new StringReader(sw.toString());
            int i;

            String str = "";
            while ((i = sr.read()) != -1)
                str += (char) i;

            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
