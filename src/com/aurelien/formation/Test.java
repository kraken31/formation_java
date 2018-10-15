package com.aurelien.formation;

public class Test {
    public static void main(String[] args) {
        int j=20, i=0;

        try {
            System.out.println(j / i);
        } catch (ArithmeticException e) {
            System.out.println("Division par zéro => " + e.getMessage());
        } finally {
            System.out.println("Action effectuée systématiquement");
        }
        System.out.println("Coucou toi");
    }
}
