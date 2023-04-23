package com.company;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @author Facu Paez
 * Tema: Streams.
 * Los Streams en java son un nuevo modelo de datos que nos permite tratar las colecciones como si de etapas
 * de un proceso ETL (“Extract Transform and Load”) se tratara.
 * Toda colección tiene un método stream() que transformará dicha estructura en Stream.
 * @version 1.0
 */
public class StreamMain {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Carl");
        names.add("Pepe");
        names.add("John");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        // recorriendo lista con POO
        for(String name : names){
            System.out.println(name);
        }

        // recorriendo lista con programacion funcional (aporta legibilidad)

        // forEach se utiliza para recorrer un array y mostrar los elementos en este caso.
        names.stream().forEach(x -> System.out.println(x));

        // Map se utiliza para mapear: por cada elemento recorrido por mi stream le aplico otra función.
        // Estas funciones devuelven objetos streams, por lo que debemos generar varaibles de tipo Stream
        // para mostrarlos.
        Stream<String> valuesMap = names.stream()
                .map((x) -> "Hola, " + x.toUpperCase());

        // una ves que consumamos con un forEach un stream ya no podremos reutilizarlo.
        valuesMap.forEach(x -> System.out.println(x));

        // Con la función filter podemos filtrar elementos de un array.
        Stream<String> valuesFilter = names.stream()
                .map((x) -> x.toUpperCase())
                .filter((x) -> x.startsWith("P"));

        valuesFilter.forEach((x) -> System.out.println(x));

        // La función reduce toma todos los elementos que quedan y los reduce a una expresión.
        // Como primer parámetro debemos darle un valor inicial del tipo que estemos usando. (int, String, etc).
        // En el siguiente parámetro debemos darle la expresion de reducción, por ejemplo sumar números pares.
        // En el primer parámetro ira guardando el resultado del segundo parámetro que son los valore que recibe.
        // x representa al 0, mientras y representa a cada valor del array filtrado que va entrando.
        // cada vez que retorna el resultado de la suma, se va guardando en x.
        int numbersValues = numbers.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);

        System.out.println(numbersValues);
    }
}
