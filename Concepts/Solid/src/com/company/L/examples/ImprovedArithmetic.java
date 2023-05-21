package com.company.L.examples;

public class ImprovedArithmetic extends Arithmetic{
    @Override
    int sum(int a, int b) {
        return a + b;
    }

    @Override
    int substraction(int a, int b) {
        return a - b;
    }

    @Override
    int division(int a, int b) {
        return a / b;
    }

    @Override
    int multiplication(int a, int b) {
        return a * b;
    }
}
