package com.aurelien.formation;

public class Test {
    public static void main(String[] args) {
        Ville v = null;
        try {
            v = new Ville("Re", 12000, "France");
        } catch (NombreHabitantException | NomVilleException e2) {
            System.out.println(e2.getMessage());
        }
        finally {
            if (v == null)
                v = new Ville();
        }
        System.out.println(v.toString());
    }
}
