package com.aurelien.formation;

public class HelloWorld {
    public static void main(String[] args) {
        Ville v = new Ville();
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
        Ville v1 = new Ville("Marseille", 1236, "France");
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());
        Ville v2 = new Ville("Rio", 321654, "Brésil");
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.nbreInstances);
        System.out.println("Le nombre d'instances de la classe Ville est : " + Ville.getNombreInstancesBis());

        System.out.println("\n\n"+v1.decrisToi());
        System.out.println(v.decrisToi());
        System.out.println(v2.decrisToi()+"\n\n");
        System.out.println(v1.comparer(v2));
    }
}
