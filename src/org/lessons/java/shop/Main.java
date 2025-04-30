package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("croccantini", "molto croccanti", 20.5f);

        prodotto.calculateIva();

        System.out.println(prodotto.code);
        System.out.println(prodotto.calculateIva());
        
        prodotto.extendName();
    }
}
