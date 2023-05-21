package com.company.L.examples;

public class Main {
    public static void main(String[] args) {

        // al hacer una clase que hereda de otra, la clase hija puede usar los métodos de la clase padre pero la clase
        // padre no puede usar los métodos de a clase hija, esto no cumple el principío de sustitución de Liskov
        //Arithmetic arithmetic = new Arithmetic();

        // no cumple
        //arithmetic.division(3, 2);

        // al crear una clase abstracta cuando implemento los métodos de cualquier clase común puedo usar el método
        // que necesite sin cambiar la clase abstracta que contiene los métodos abstractos.
        Arithmetic arithmetic = new ImprovedArithmetic();
        Arithmetic arithmetic1 = new ImprovedArithmeticExtra();

        int val = arithmetic.division(4, 2);
        int val1 = arithmetic1.division(4, 2);

        System.out.println("Aritmética división es:" + val);
        System.out.println("Aritmética1 división es:" + val1);
    }
}
