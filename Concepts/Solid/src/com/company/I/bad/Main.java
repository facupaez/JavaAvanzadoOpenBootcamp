package com.company.I.bad;


public class Main {

    public static void main(String []args) {
        User user = new User();
        user.userName = "openbootcamp";
        user.name = "Open";
        user.lastName = "Bootcamp";
        user.email = "ejemplos@open-bootcamp.com";
        user.levelAccess = 5;


        User user2 = new User();
        user2.userName = "openbootcamp2";
        user2.name = "Open2";
        user2.lastName = "Bootcamp2";
        user2.email = "ejemplos2@open-bootcamp.com";
        user2.levelAccess = 10;

        // creando dos instancias distintas de la clase padre UsersDB podemos usar sus métodos abstractos obteniendo
        // los mismos resultados.
        UsersDB users = new UsersDBMemory();
        UsersDB users1 = new UsersDBFile();
        users.addUser(user);
        users.addUser(user2);
        users1.addUser(user);
        users1.addUser(user2);

        //User openbootcamp = users.getUser("Open2");
        //System.out.println(openbootcamp.email);

        //users.deleteUser(user2);

        for (User existingUser : users.listUsers()) {
            System.out.println("Usuario actual: " + existingUser.userName);
            System.out.println(existingUser);
            System.out.println();
        }
    }
}
