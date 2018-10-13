package com.aurelien.formation;

import com.aurelien.comportements.*;

public class Medecin extends Personnage {
    public Medecin() {
        this.soin = new PremierSoin();
    }
}
