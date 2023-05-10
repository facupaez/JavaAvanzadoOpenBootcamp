package com.company;

/**
 * @author Facu Paez
 * Tema: Manejo de Excepciones.
 * Existen tres tipos de errores:
 * Errores de compilación: son errores de sintaxis que el programador comete al escribir código, generalmente
 * el entorno de desarrollo ayude a señalizar estos errores.
 * Runtime Exception: errores en tiempo de ejecución del programa. Ej: acceder fuera de los límites de un array
 * o algo tan simple como tratar de dividir por cero.
 * IOException: errores de entrada y salida que suelen ser ajenos al programador.
 */
public class Main {

    public static void main(String[] args) {

        Users users = new Users();

        try {
            users.addUser("Marcos");
            users.addUser("Marcos");
        } catch (UsersException e) {
            System.out.println(e.getMessage());
        }


       /* divideBy0(5);

        try {
            divideBy0Personal(5);
        } catch (DivideException e) {
            System.out.println(e.getMessage());
        }*/
    }

    // Generamos exception Arithmetic y la capturamos en try catch
    private static double divideBy0(int num) {
        double result = 0;

        try {
            result = num / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }

        return result;
    }

    // Gestión de excepciones propias
    public static double divideBy0Personal(int num) throws DivideException {
        double result = 0;

        try {
            result = num / 0;
        } catch (ArithmeticException e) {
            // debemos gestionar la excepción en la firma del método
            throw new DivideException("Error al dividir");
        }

        return result;
    }
}
