package com.aurelien.formation;

public class Chat extends Felin {

    public void Chat() {}

    public Chat(String couleur, int poids) {
        this.couleur = couleur;
        this.poids = poids;
    }

    void crier() {
        System.out.println("Je miaule sur les toits !");
    }
}
