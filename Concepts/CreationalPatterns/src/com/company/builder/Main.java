package com.company.builder;

/**
 * @author Facu Paez
 * Tema: Patrones creacionales.
 * El patrón builder nos permite crear objetos complejos paso a paso.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        /*Vehicle vehicle = new Vehicle();
        vehicle.setBrand("Mustang");
        vehicle.setType("Petrol");
        vehicle.setEngine("Combustion");
        vehicle.setDoors(5);*/

        // instanciando con builder el cual retorna la instacia de la clase Vehiculo
        // aqui gracias a build podremos utilizar programacion fluida
        Vehicle car = new CarBuilder("Mustang")
                .setDoors(5)
                .setEngine("Electric")
                .build();

        System.out.println(car.toString());
    }
}
