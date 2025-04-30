package org.lessons.java.shop;

public class Main {

    public static void main(String[] args) {

        Prodotto prodotto = new Prodotto("croccantini", "molto croccanti", 20.5f);

        prodotto.calculateIva();

        System.out.println(prodotto.code);

        //how to format the output as i would to be with %
        System.out.printf("il prezzo comprensivo di iva è: %.2f %n" , prodotto.calculateIvaNotFormatted());

        //without printf
        System.out.println(prodotto.calculateIva());
        
        prodotto.extendName();
    }
}
