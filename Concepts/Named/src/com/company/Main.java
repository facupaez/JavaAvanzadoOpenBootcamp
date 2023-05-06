package com.company;

/**
 * @author Facu Paez
 * Tema: Nombrado.
 * Consiste en dar un nombre claramente descriptivo que indentifique a aquello que se lo estamos otorgando.
 * Cada parte de la aplicación que desarrollamos debe tener un nombre adecuado.
 * Con estas convenciones lograremos un código limpio.
 */
public class Main {

    public static void main(String[] args) {
        // write your code here
    }
}

// Clases: nombres sustantivos, comienzan con mayúsculas capitalizando cada nueva palabra.
class ReverseString {
}

// Interfaces: nombres adjetivos, comienzan con la letra I, seguido de mayúsculas capitalizando cada nueva palabra.
// Cuando escribamos nombres de interfaces en inglés trataremos que siempre terminen en "able".
interface Iterable {
}

class User {

    // Constantes: guardan un valor que nunca cambiará, siempre se escriben en mayúsculas y las palabras separadas
    // con guiones bajos.
    public static final String NEW_GREETING = "HOLA";

    // Propiedades: es una variable local dentro de una clase que almacena un tipo de dato.
    // Los nombres de las variables deben ser auto descriptivos, y deben escribirse en minúsculas capitalizando
    // cada nueva palabra.
    int[] numbers = {1, 2, 3, 4, 5};
    int[] oddNumbers = {1, 3, 5, 7, 9};
    String greeting = "Hello world!";


    // Métodos: comienzan con minúsculas capitalizando cada nueva palabra, deben describir claramente lo que hacen.
    public void createUser() {
    }
}

