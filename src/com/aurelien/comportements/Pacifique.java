package com.aurelien.comportements;

public class Pacifique implements EspritCombatif {
    @Override
    public void combat() {
        System.out.println("Je suis pacifique");
    }
}
