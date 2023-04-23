package com.company;

import java.util.Locale;
import java.util.function.Function;

/**
 * @author Facu Paez
 * Tema: Funciones alto nivel (high level).
 * Tiene que recibir un parámetro que obligatoriamente sea otra función o que bien devuelve una función existente.
 * @version 1.0
 */
public class HighLevelFunctionsMain {

    public static void main(String[] args) {

        System.out.println(convertir("high level"));

        // invocando lambda
        // hacemos static la funcion para poder utilizarla sin instancearla
        System.out.println(convertirMayus.apply("high level lambda"));
    }

    // funcion high level.
    private static String convertir(String word) {
        return word.toUpperCase(); // devuelve una función.
    }

    // funcion high level: lambda.
    // se escriben con la palabra reservada Function.
    // en el operador diamante primero colocamos que tipo de dato recibe y luego que tipo de dato devuelve.
    // la función debe tener un nombre.
    // a este nombre le asignamos la variable que recibe, el operador flecha y la variable que devuelve.
    // al ser una función tipo high level siempre debe devolver una función.
    private static Function<String, String> convertirMayus = (x) -> x.toUpperCase();
}
