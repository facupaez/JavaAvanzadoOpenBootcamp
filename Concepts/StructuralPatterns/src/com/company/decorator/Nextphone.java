package com.company.decorator;

public class Nextphone extends TelephoneDecorator{

    public Nextphone(ITelephone itelephone) {
        // con la palabra super llamamos a la clase base
        super(itelephone);
    }

    @Override
    public void create(){
        super.create();
        System.out.println("Tengo tambien next gen!");
    }
}
