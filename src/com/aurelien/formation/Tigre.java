package com.aurelien.formation;

public class Tigre extends Felin {

    public void Tigre() {}

    public Tigre(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("Je grogne très fort !");
    }
}
