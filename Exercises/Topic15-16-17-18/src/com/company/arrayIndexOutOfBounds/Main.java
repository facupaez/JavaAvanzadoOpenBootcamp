package com.company.arrayIndexOutOfBounds;

/**
 * @author Facu Paez
 * Trabajando con excepciones debemos implementar:
 * ArrayIndexOutOfBounds con un array de 6 elementos, tratando de alcanzar el noveno elemento.
 */
public class Main {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6};

        try {
            System.out.println(nums[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No es posible acceder a la posicion de un elemento inexistente: " + e.getMessage());
        }
    }
}
