package com.company;

/**
 * @author Facu Paez
 * Podemos generar nuestras propias excepciones creando una clase y extendiendo de la clase padre Exception,
 * aquí debemos crear un constructor con el parámetro mensaje e invocar al constructor de la clase padre pasandole
 * los parámteros que recibimos.
 * @version 1.0
 */
public class DivideException extends Exception{
    public DivideException(String message){
        super(message);
    }
}
