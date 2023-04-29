package com.company.factory;

public class PriceFactory {

    // variable price de tipo Price interface
    Price price;

    // ocultamos constructor
    private PriceFactory(){}

    // creamos metodo para comprobar que recibimos al instanciar la clase factory
    public PriceFactory(String country){
        if(country.equalsIgnoreCase("España")){
            System.out.println("España, precio en EUR");
            this.price = new PriceEUR();
        }else if(country.equalsIgnoreCase("Argentina")){
            System.out.println("Argentina, precio en peso ARG");
            this.price = new PricePesoARG();
        }else if(country.equalsIgnoreCase("EEUU")){
            System.out.println("EEUU, precio en USD");
            this.price = new PriceUSD();
        }
    }
}
