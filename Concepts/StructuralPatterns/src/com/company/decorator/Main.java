package com.company.decorator;

/**
 * @author Facu Paez
 * Tema: Patrones estructurales.
 * El patron Decorator añade funcionalidad a una clase existente sin modificarla.
 * Esto se hace envolviendo una clase base dentro de una sub clase, y se puede hacer muchas veces.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Telephone");
        Telephone telephone = new Telephone();
        telephone.create();

        System.out.println("Smartphone");
        Smartphone smartphone = new Smartphone(new Telephone());
        smartphone.create();

        System.out.println("NextGenphone");
        Nextphone nextphone = new Nextphone(new Smartphone(new Telephone()));
        nextphone.create();
    }
}
