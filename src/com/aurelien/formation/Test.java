package com.aurelien.formation;

public class Test {
    public static void main(String[] args) {
        Chien l = new Chien("Gris bleuté", 20);
        l.boire();
        l.manger();
        l.deplacement();
        l.crier();
        System.out.println(l.toString());
        l.faireCalin();
        l.faireLeBeau();
        l.faireLechouille();

        System.out.println("\n-------\n");
        Rintintin r = new Chien();
        r.faireCalin();
        r.faireLeBeau();
        r.faireLechouille();
    }
}
