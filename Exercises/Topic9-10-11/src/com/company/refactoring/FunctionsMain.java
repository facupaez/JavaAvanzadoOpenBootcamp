package com.company.refactoring;

import java.util.Arrays;

public class FunctionsMain {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        printBiggerAndSmaller(numbers);
        printBiggerAndSmallerTernarry(numbers);
        printBiggerAndSmallerForeach(numbers);
        printBiggerAndSmallerLambda(numbers);
    }

    private static void printBiggerAndSmaller(int[] numbers) {
        int bigger = 0;
        int smaller = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (bigger < numbers[i]) bigger = numbers[i];
            if (smaller > numbers[i]) smaller = numbers[i];
        }

        System.out.println("El número mayor es: " + bigger + ", el número menor es: " + smaller);
    }

    // refactorizando código anterior aplicando operadores ternarios
    private static void printBiggerAndSmallerTernarry(int[] numbers) {
        int bigger = 0;
        int smaller = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            bigger = bigger < numbers[i] ? numbers[i] : bigger;
            smaller = smaller > numbers[i] ? numbers[i] : smaller;
        }

        System.out.println("El número mayor es: " + bigger + ", el número menor es: " + smaller);
    }

    // refactorizando código anterior aplicando for each
    private static void printBiggerAndSmallerForeach(int[] numbers) {
        int bigger = 0;
        int smaller = numbers[0];

        for (int i : numbers) {
            bigger = bigger < i ? i : bigger;
            smaller = smaller > i ? i : smaller;
        }

        System.out.println("El número mayor es: " + bigger + ", el número menor es: " + smaller);
    }

    // refactorizando código anterior aplicando programación funcional
    private static void printBiggerAndSmallerLambda(int[] numbers) {
        int bigger = Arrays.stream(numbers)
                .reduce(0, (a, b) -> a > b ? a : b);

        int smaller = Arrays.stream(numbers)
                .reduce(numbers[0], (a, b) -> a < b ? a : b);

        System.out.println("El número mayor es: " + bigger + ", el número menor es: " + smaller);
    }
}
