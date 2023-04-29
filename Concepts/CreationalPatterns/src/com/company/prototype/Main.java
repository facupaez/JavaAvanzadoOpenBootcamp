package com.company.prototype;

/**
 * @author Facu Paez
 * Tema: Patrones creacionales.
 * El patrón prototype nos permite clonar una clase a si misma.
 * Este clon hereda todos los metodos, propiedades y valores de su propio clon.
 * Podemos utilizar el patron prototype manualmente o utilizando la interface Cloneable de Java.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setDoors(5);
        car.setBrand("Ferrari");
        car.setModel("Sedan");
        System.out.println("Imprimiendo original: " + car);

        // clonamos instancia de Car (forma manual)
     /*  Car clone = car.cloneCar();
        clone.setDoors(3);
        clone.setBrand("Ferrari");
        clone.setModel("Coupe");
        System.out.println("Imprimiendo clon: " + clone);*/

        // clonamos instancia de Car (forma Java)
        try {
            Car clone = car.cloneCar();
            clone.setDoors(3);
            clone.setBrand("Ferrari");
            clone.setModel("Coupe");
            System.out.println("Imprimiendo clon: " + clone);
        } catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}
