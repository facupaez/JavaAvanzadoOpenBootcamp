package com.company.L.examples;

public class ImprovedArithmeticExtra extends Arithmetic{
    @Override
    int sum(int a, int b) {
        System.out.println("Estoy en suma.");
        return a + b;
    }

    @Override
    int substraction(int a, int b) {
        System.out.println("Estoy en resta.");
        return a - b;
    }

    @Override
    int division(int a, int b) {
        System.out.println("Estoy en división.");
        return a / b;
    }

    @Override
    int multiplication(int a, int b) {
        System.out.println("Estoy en multiplicación.");
        return a * b;
    }
}
