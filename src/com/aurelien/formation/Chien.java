package com.aurelien.formation;

public class Chien extends Canin {

    public void Chien() {}

    public Chien(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("J'aboie sans raison !");
    }
}
