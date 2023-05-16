package com.company.args;

/**
 * @author Facu Paez
 * Implementando párametros args dependiendo el entorno de trabajo que usemos
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        String entorno = args[0];
        if (entorno.equals("Development")) {
            System.out.println("Ejecutando código del desarrollo");
        }else if (entorno.equals("Test")){
            System.out.println("Ejecutando código de test");
        }else if ((entorno.equals("Production"))){
            System.out.println("Ejecutando código de producción");
        }
    }

}
