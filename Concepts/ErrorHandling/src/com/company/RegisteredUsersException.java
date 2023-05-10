package com.company;

/**
 * @author Facu Paez
 * Podemos generar nuestras propias excepciones extendiendo de otras excepciones propias.
 * @version 1.0
 */
public class RegisteredUsersException extends UsersException{
    public RegisteredUsersException(String message){
        super("el usuario " + message + " ya existe!");
    }
}
