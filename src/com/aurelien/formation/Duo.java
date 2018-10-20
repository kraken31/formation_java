package com.aurelien.formation;

public class Duo<T, S> {
    private T valeur1;
    private S valeur2;

    public Duo() {
        this.valeur1 = null;
        this.valeur2 = null;
    }

    public Duo(T val1, S val2) {
        this.valeur1 = val1;
        this.valeur2 = val2;
    }

    public T getValeur1() {
        return this.valeur1;
    }

    public S getValeur2() {
        return this.valeur2;
    }

    public void setValeur(T valeur1, S valeur2) {
        this.valeur1 = valeur1;
        this.valeur2 = valeur2;
    }

    public void setValeur1(T valeur) {
        this.valeur1 = valeur;
    }

    public void setValeur2(S valeur) {
        this.valeur2 = valeur;
    }
}
