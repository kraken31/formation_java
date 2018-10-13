package com.aurelien.formation;

import com.aurelien.comportements.*;

public abstract class Personnage {
    protected EspritCombatif espritCombatif = new Pacifique();
    protected Deplacement deplacement = new Marcher();
    protected Soin soin = new AucunSoin();

    public Personnage() {
    }

    public Personnage(EspritCombatif espritCombatif, Deplacement deplacement, Soin soin){
        this.espritCombatif = espritCombatif;
        this.deplacement = deplacement;
        this.soin = soin;
    }

    public void setEspritCombatif(EspritCombatif espritCombatif){
        this.espritCombatif = espritCombatif;
    }

    public void setDeplacement(Deplacement deplacement) {
        this.deplacement = deplacement;
    }

    public void setSoin(Soin soin) {
        this.soin = soin;
    }

    public void seDeplacer() {
        deplacement.deplacer();
    }
    public void combattre() {
        espritCombatif.combat();
    }
    public void soigner() {
        soin.soigne();
    }
}
