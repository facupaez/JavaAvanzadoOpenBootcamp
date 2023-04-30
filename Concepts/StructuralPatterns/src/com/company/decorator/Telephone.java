package com.company.decorator;

// Clase basica que implementa la interface Telephone
public class Telephone implements ITelephone{
    @Override
    public void create() {
        System.out.println("Soy un telefono basico");
        this.GSM();
        this.SMS();
    }

    private void GSM(){
        System.out.println("Tengo GSM");
    }

    private void SMS(){
        System.out.println("Tengo SMS");
    }
}
