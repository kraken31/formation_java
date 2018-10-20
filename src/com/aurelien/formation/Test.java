package com.aurelien.formation;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        File f = new File("test.txt");
        System.out.println("Chemin absolu du fichier : " + f.getAbsolutePath());
        System.out.println("Nom du fichier : " + f.getName());
        System.out.println("Est-ce qu'il existe ? : " + f.exists());
        System.out.println("Est-ce un répertoire ? : " + f.isDirectory());
        System.out.println("Est-ce un fichier ? : " + f.isFile());

        File f2 = new File("/");
        for (File nom : f2.listFiles()) {
            System.out.println(((nom.isDirectory()) ? nom.getName()+"/" : nom.getName()));
        }

    }
}
