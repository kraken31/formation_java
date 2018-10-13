package com.aurelien.comportements;

public class CombatCouteau implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("Je combats au couteau");
    }
}
