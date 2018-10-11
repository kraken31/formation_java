package com.aurelien.formation;

abstract class Animal {
    protected int poids;
    protected String couleur;

    protected void manger() {
        System.out.println("Je mange de la viande.");
    }
    protected void boire() {
        System.out.println("Je bois de l'eau.");
    }

    public String toString() {
        String str = "Je suis un objet de la " + this.getClass() + ", je suis " + this.couleur + ", je pèse " + this.poids;
        return str;
    }

    abstract void deplacement();

    abstract void crier();
}
