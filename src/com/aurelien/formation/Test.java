package com.aurelien.formation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test {
    public static void main(String[] args) {
        Class c = new String().getClass();
        Class[] faces = c.getInterfaces();
        Method[] m = c.getMethods();

        System.out.println("Il y a " + faces.length + " interfaces implémentées");
        for (int i = 0 ; i < faces.length; i++)
            System.out.println(faces[i]);

        System.out.println("==========\n");

        Field[] f = c.getDeclaredFields();
        System.out.println("Il y a " + f.length + " champs dans cette classe");
        for (int i = 0 ; i < f.length; i++)
            System.out.println(f[i].getName());

        System.out.println("==========\n");

        Constructor[] construc = c.getConstructors();
        System.out.println("Il y a " + construc.length + " constructeur dans cette classe");
        for (int i = 0 ; i < construc.length; i++)
            System.out.println(construc[i]);

        System.out.println("==========\n");

        System.out.println("Il y a " + m.length + " méthodes dans cette classe");
        for (int i = 0 ; i < m.length; i++) {
            System.out.println(m[i]);

            Class[]p = m[i].getParameterTypes();
            for (int j = 0; j < p.length; j++)
                System.out.println(p[j].getName());

            System.out.println("----------------------------\n");
        }
    }
}
