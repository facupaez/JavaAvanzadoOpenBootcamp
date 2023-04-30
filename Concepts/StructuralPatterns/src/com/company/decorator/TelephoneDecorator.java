package com.company.decorator;

// Clase decorator que implementa la interface Telephone
public class TelephoneDecorator implements ITelephone{
    private final ITelephone itelephone;

    // creo constructor cuyo parametro es una clase que implementa la interface telephone
    public TelephoneDecorator(ITelephone itelephone){
        this.itelephone = itelephone;
    }

    @Override
    public void create() {
        // invocamos al metodo de la clase original
        this.itelephone.create();
    }
}
