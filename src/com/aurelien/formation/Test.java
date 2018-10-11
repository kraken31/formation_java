package com.aurelien.formation;

public class Test {
    public static void main(String[] args) {
        Animal l = new Loup("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());
    }
}
