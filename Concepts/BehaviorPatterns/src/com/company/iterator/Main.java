package com.company.iterator;

/**
 * @author Facu Paez
 * Tema: Patrones de comportamiento.
 * El patrón iterator implementa una serie de métodos en nuestra clase de forma que podamos recorrer datos sin
 * saber cómo están almacenados internamente en esa clase.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        UserImpl users = new UserImpl();
        users.addUser(new User("Charly", 50));
        users.addUser(new User("John", 21));
        users.addUser(new User("Marge", 32));

        // recorriendo lista usuarios

        while (users.hasMore()){
            User user = users.next();
            System.out.println("User is: " + user.getName());
        }

        users.addUser(new User("Carl", 35));
        User user = users.next();
        System.out.println("User is " + user.getName());

        users.reset();

        while (users.hasMore()){
            user = users.next();
            System.out.println("User is: " + user.getName());
        }
    }
}
