package com.aurelien.formation;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(12);
        al.add("Une chaîne de caractères !");
        al.add(12.20f);
        al.add(null);
        al.add('d');

        for (int i=0; i<al.size(); i++)
            System.out.println("Donnée à l'indice " + i + " = " + al.get(i));
    }
}
