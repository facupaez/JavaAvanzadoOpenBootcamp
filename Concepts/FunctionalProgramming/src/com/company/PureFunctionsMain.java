package com.company;

/**
 * @author Facu Paez
 * Tema: Funciones puras.
 * Son aquellas que siempre devuelven el mismo valor cuando sus parámetros de entrada no varíen.
 * No pueden tener efectos colaterales a la hora de invocarse. Por ejemplo modificar una variable global.
 * Deben hacer concretamente lo que dicen, si suma solo debe sumar.
 * Son fáciles de entender pero difíciles de implementar.
 * @version 1.0
 */
public class PureFunctionsMain {

    private static int counter = 0;

    public static void main(String[] args) {

    int result = sum(1, 2);
    }

    private static int sum(int a, int b) {
        double addition = Math.random(); // Utiiza funciones externas. Impura.
        int counter = 0; // Permiten modificar variables locales. Pura.
        counter++; // Efecto colateral. Impura.
        multiply(2, 3); // No puede hacer algo para lo que no esta hecha. Solo debe sumar. Impura.
        return a+b;
    }

    private static int multiply(int a, int b) {
        counter++; // efecto colateral
        return a*b;
    }


}
