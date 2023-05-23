package com.company.O;

/**
 * @author Facu Paez
 * Ejercicio:
 * Extiende el código para aumentar su funcionalidad pero sin modificarlo aplicando el principio abierto/cerrado(O).
 */
public class Main {

    public static void main(String[] args) {

        // creamos listas de tipos de marca de coches
        Car[] arrayCars = {
                new Ferrari(),
                new BMW(),
                new MercedesBenz()
        };

        printBrandCar(arrayCars);
    }

    // creamos método para ir a la clase abstracta e implementar el método abstracto que sobreescribe cada clase.
    private static void printBrandCar(Car[] arrayCars) {
        for (Car car : arrayCars){
            System.out.println(car.getBrand());
        }
    }
}
