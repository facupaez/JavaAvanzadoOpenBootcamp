package com.company.S.examples;

public class User {

    public void addUser(String username){}

    public void getUser(String username){}

    // este método rompe con el principio de responsabilidad única
    // a continuación corregiremos su implementación creando otra clase y asociándola a esta
    // public void sendEmail(String username){}

    // asociando método para envío de email
    public void notifyUser(String username){
        Emailer emailer = new Emailer();
        emailer.sendEmail(this);
    }
}

class Emailer {
    // creamos método para enviar emails
    public void sendEmail(User user){}
}