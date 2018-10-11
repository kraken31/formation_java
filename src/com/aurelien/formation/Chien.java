package com.aurelien.formation;

public class Chien extends Canin implements Rintintin {

    public Chien() {}

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("J'aboie sans raison !");
    }

    @Override
    public void faireCalin() {
        System.out.println("Je te fais un gros calin !");
    }

    @Override
    public void faireLeBeau() {
        System.out.println("Je fais le beau.");
    }

    @Override
    public void faireLechouille() {
        System.out.println("Je fais une grosse léchouille");
    }
}
