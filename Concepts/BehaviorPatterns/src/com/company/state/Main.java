package com.company.state;

/**
 * @author Facu Paez
 * Tema: Patrones de comportamiento.
 * El patrón state permite a un objeto alterar su comportamiento cuando su estado interno cambia.
 * Parece como si el objeto cambiara su clase.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Telephone telephone1 = new Telephone();

        System.out.println(telephone1.status.unlock());
        System.out.println(telephone1.status.openCam());
        System.out.println(telephone1.status.makePhoto());
        System.out.println(telephone1.status.makePhoto());

    }
}
