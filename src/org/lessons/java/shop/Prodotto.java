package org.lessons.java.shop;

import java.util.Random;

// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva

public class Prodotto {

    Random rand = new Random();

    int code;
    String name;
    String desc;
    float price;
    int iva = 22;

    Prodotto(String name, String desc, float price) {
        this.code = rand.nextInt(50);
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    String calculateIva() {
        float priceWiva = (price * iva) / 100 + price;
        String priceFormat = String.format("%.2f", priceWiva);
        return priceFormat;
    }

    float calculateIvaNotFormatted() {
        float priceWiva = (price * iva) / 100 + price;
        return priceWiva;
    }

    void extendName() {
        System.out.println(code + "-" + name);
    }

}
