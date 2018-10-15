package com.aurelien.formation;

public class NombreHabitantException extends Exception {

    public NombreHabitantException() {
        System.out.println("Vous essayez d'instancier une classe ville avec un nomnbre d'habitants négatif !");
    }

    public NombreHabitantException(int nbre) {
        System.out.println("Vous essayez d'instancier une classe ville avec un nomnbre d'habitants négatif !");
        System.out.println("\t => " + nbre);
    }
}
