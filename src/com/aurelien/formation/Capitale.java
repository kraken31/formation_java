package com.aurelien.formation;

public class Capitale extends Ville {

    private String monument;

    //Constructeur par défaut
    public Capitale() {
        super();
        monument = "aucun";
    }

    //Constructeur d'initialisation de capitale
    public Capitale(String nom, int hab, String pays, String monument) {
        super(nom, hab, pays);
        this.monument = monument;
    }

    /**
     *
     * @return le nom du monument
     */
    public String getMonument() {
        return monument;
    }

    // Définit le nom du monument
    public void setMonument(String monument) {
        this.monument = monument;
    }

    /**
     * Description d'une capitale
     * @return String retourne la description de l'objet
     */
    public String decrisToi() {
        String str = super.decrisToi() + "\n \t ==>>" + this.monument + " en est un monument";

        return str;
    }

    public String toString() {
        String str = super.toString() + "\n \t ==>>" + this.monument + " en est un monument";
        return str;
    }
}
