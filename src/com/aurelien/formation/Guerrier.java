package com.aurelien.formation;

import com.aurelien.comportements.*;

public class Guerrier extends Personnage {
    public Guerrier() {
        this.espritCombatif = new CombatPistolet();
    }
}
