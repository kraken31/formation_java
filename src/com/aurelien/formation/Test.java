package com.aurelien.formation;

public class Test {
    public static void main(String[] args) {
        Duo<String, Integer> dual = new Duo<String, Integer>("test", 2);
        System.out.println("val1=" + dual.getValeur1() + " - val2=" + dual.getValeur2());
        Duo<String, String> dual2 = new Duo<String, String>("test", "test");
        System.out.println("val1=" + dual2.getValeur1() + " - val2=" + dual2.getValeur2());
    }
}
