package com.company;

public class UserException extends Exception{
    public UserException(String message){
        super("User exception: " + message);
    }
}
