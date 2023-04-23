package com.company;


import java.util.stream.IntStream;

/**
 * @author Facu Paez.
 * Tema: Recursividad.
 * Una función es recursiva cuando se llama a sí misma. Esto lo hacemos invocando una función desde otra función.
 * Existen dos tipos de recursividad: en cola y en cabeza.
 * Tail Recursion: cuando invocamos a la función al final del cuerpo de otra función.
 * Head Recursion: cuando invocamos a la función al principio del cuerpo de otra función.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Sumatoria es: " + suma(5));
        System.out.println("Sumatoria recursiva es: " + sumaRecursiva(5));
        System.out.println("Sumatoria funcional es: " + sumaFuncional(5));
    }

    // función iterativa: dado num, suma desde 0 todos los consecutivos hasta num.
    public static int suma(int num) {
        int result = 0;

        for (int i = 0; i <= num; i++) {
            result += i;
        }

        return result;
    }

    // función recursiva: dado num, suma desde 0 todos los consecutivos hasta num.
    public static int sumaRecursiva(int num) { // tail recursion
        if (num == 1) return 1;

        return num + sumaRecursiva(num - 1);
    }

    // recursividad funcional: dado num, suma desde 0 todos los consecutivos hasta num.
    public static int sumaFuncional(int num){
        return IntStream.rangeClosed(1, num)
                .reduce(0, (a, b) -> a + b);
    }
}
