package com.company.arithmeticException;

/**
 * @author Facu Paez
 * Trabajando con excepciones debemos implementar:
 * Arithmetic exception tratando de hacer una división entre dos números, siendo el que divide 0.
 */
public class Main {

    public static void main(String[] args) {

    divide(5, 0);
    }

    private static double divide(int num, int divider) {
        try{
            return num / divider;
        }catch (ArithmeticException e){
            System.out.println("No esta permitido dividr por 0: " + e.getMessage());
        }
        return 0;
    }
}
