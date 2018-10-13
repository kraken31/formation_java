package com.aurelien.comportements;

public class PremierSoin implements Soin {
    @Override
    public void soigne() {
        System.out.println("Je donne les permiers soins");
    }
}
