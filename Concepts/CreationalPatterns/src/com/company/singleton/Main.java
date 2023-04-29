package com.company.singleton;

/**
 * @author Facu Paez
 * Tema: Patrones creacionales.
 * En el patrón singleton solo puede haber una instancia de una clase.
 * Por ejemplo al crear dos instancias de una clase, esta siempre tendra la misma referencia de memoria.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // instanciamos clase singleton con el metodo getInstance()
        // de esta forma compartimos la referencia de memoria entre la cantidad de instancias de Singleton que creemos.
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        singleton.setCount(15);
        System.out.println(singleton.getCount());
        System.out.println(singleton);

        singleton2.setCount(15);
        System.out.println(singleton2 .getCount());
        System.out.println(singleton2);
    }
}
