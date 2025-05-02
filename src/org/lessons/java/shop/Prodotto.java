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

    private int code;
    private String name;
    private String desc;
    private float price;
    private int iva = 22;

    public Prodotto(String name, String desc, float price) {
        this.code = rand.nextInt(50);
        this.name = name;
        this.desc = desc;
        this.price = price;
    }

    public Prodotto(String name, float price) {
        this.code = rand.nextInt(50);
        this.name = name;
        this.price = price;
    }

    // let's add the getter to access to the code
    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String newDesc) {
        this.desc = newDesc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float newPrice) {
        this.price = newPrice;
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
