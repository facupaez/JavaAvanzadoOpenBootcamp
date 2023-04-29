package com.company.factory;

/**
 * @author Facu Paez
 * Tema: Patrones creacionales.
 * En el patrón factory nos permite cohesionar una jerarquia de clases en una única.
 * Por ejemplo al tener varias clases de precios podemos cohesionarlas en una sola clase y crear varias instancias.
 * A continuación veremos tipos de cambio en relación al dolar.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        PriceFactory priceESP = new PriceFactory("España");
        System.out.println(priceESP.price.getPrice());

        PriceFactory priceARG = new PriceFactory("Argentina");
        System.out.println(priceARG.price.getPrice());

        PriceFactory priceEEUU = new PriceFactory("EEUU");
        System.out.println(priceEEUU.price.getPrice());
    }
}
