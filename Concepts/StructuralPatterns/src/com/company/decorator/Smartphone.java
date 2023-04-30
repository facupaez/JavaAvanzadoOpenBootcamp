package com.company.decorator;

// heredamos del decorator TelephoneDecorator
public class Smartphone extends TelephoneDecorator{

    public Smartphone(ITelephone itelephone) {
        // con la palabra super llamamos a la clase base
        super(itelephone);
    }

    @Override
    public void create(){
        super.create();
        System.out.println("Tengo tambien smart");
    }
}
