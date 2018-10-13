package com.aurelien.comportements;

public class AucunSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je n'effectue aucun soin");
    }
}
