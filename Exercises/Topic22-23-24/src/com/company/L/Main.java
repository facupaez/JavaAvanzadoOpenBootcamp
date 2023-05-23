package com.company.L;

/**
 * @author Facu Paez
 * Ejercicio:
 * Crea subclases de la clase coche, por ejemplo un coche eléctrico, de combustible y uno híbrido y aplica el
 * principio de substitución de Liskov (L), las subclases deben ser sustituibles por la superclase coche.
 */
public class Main {

    public static void main(String[] args) {

        // creamos listas de tipos de marca de coches
        Car[] arrayCars = {
                new Ferrari(),
                new BMW(),
                new MercedesBenz()
        };

        // el método printSeatsNumber() no necesita saber con qué tipo de coche va a realizar su lógica,
        // simplemente llama al método numAsientos() del tipo Coche, ya que por contrato, una subclase de Coche
        // debe implementar dicho método.
        printSeatsNumber(arrayCars);
    }

    // creamos método para ir a la clase abstracta e implementar el método abstracto que sobreescribe cada clase.
    private static void printSeatsNumber(Car[] arrayCars) {
        for (Car car : arrayCars){
            System.out.println(car.getSeatsNumber());
        }
    }
}
