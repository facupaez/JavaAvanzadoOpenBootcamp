package com.company;

/**
 * Bloque de comentario Java Doc.
 * @author Facu Paez
 * @version 1.0
 * @since 06/05/2023
 */
public class Main {

    public static void main(String[] args) {

    // TODO: "Para hacer". Comentario de algo que queda pendiente por hacer. Cuando finalicemos esta tarea lo borraremos.

        /*
         Comentario informativo donde podremos documentar las clases, describiendo para que fueron creadas.
         Se suelen agregar licencias legales en este comentario informativo.
         Copyright (C) 2000-2010 Ejemplo.
         */
    }

    // comentarios obligatorio
    private boolean todayIsSunday(int dayNumber){
        // si numero dia es 0, lo consideramos domingo por el calendario que siguen los estadounidenses
        return dayNumber == 0 || dayNumber == 7;
    }

    // comentarios de encabezado de función
    /*
    Suma dos valores que recibe como parámetro.
    Recibe dos parámetros de tipo integer.
    Devuelve un tipo de dato integer.
     */
    private int Sum(int a, int b){
        return a + b;
    }
}
