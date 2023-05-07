package com.company;

/**
 * @author Facu Paez
 * Tema: Funciones.
 * Una función es una agrupación de codigó que debe reaizar una tarea concreta.
 * Su objetivo principal es la reutilización de código.
 * Para describir su nombre siempre utilizaremos un verbo con la primera letra de la primer palabra en minúscula
 * y las siguientes palabras en mayúsculas
 * Los argumentos o parámetros que reciba la función también deben ser descriptivos.
 */
public class Main {
    public static void main(String[] args) {

        boolean higher = higherThan(1, 2);
        System.out.println(higher);

        int infinite = infiniteParams(1, 2, 3, 5);
        System.out.println(infinite);

        // creando objeto usuario
        Users users = new Users();
        User user = new User();
        // usamos excepciones en vez de prints
        try {
            users.createUser(user);
        }catch (UserException e){
            System.out.println("Error al agregar usuario: " + e.getMessage());
        }
    }

    // funciones tan básicas debemos evitarlas, este algoritmo podemos refactorizarlo directamente en la linea
    // donde creamos la variable higher. Ej: boolean higher = a > b;
    private static boolean higherThan(int a, int b) {
        return a > b;
    }

    // debemos evitar abusar de sentencias switch en funciones
    public static boolean itsWorking(int day) {
        /*switch (day) {
            case 1:
                return true;
            break;
            case 2:
                return true;
            break;
            case 3:
                return true;
            break;
            case 4:
                return true;
            break;
            case 5:
                return true;
            break;
            case 6:
                return false;
            break;
            case 7:
                return false;
            break;
        }*/
        // en lugar de ello podemos sustituir por una sentencia if
        return day > 0 && day < 6;
    }

    // las funciones no deben tener más de 3 parámetros
    // cuando tengamos muchos parámetros haremos funciones que reciban parámetros infitinos
    public static int infiniteParams(int... nums) {
        int result = 0;
        for (int num : nums) {
            result += num;
        }
        return result;
    }

}
