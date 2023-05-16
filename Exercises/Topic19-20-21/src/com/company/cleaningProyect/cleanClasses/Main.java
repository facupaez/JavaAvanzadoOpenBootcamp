package com.company.cleaningProyect.cleanClasses;

public class Main {

    public static void main(String []args) {
        User user = new User();
        user.name = "Open";
        user.lastName = "Bootcamp";
        user.email = "ejemplos@open-bootcamp.com";
        user.levelAccess = 10;


        User user2 = new User();
        user2.name = "Open2";
        user2.lastName = "Bootcamp2";
        user2.email = "ejemplos@open-bootcamp.com";
        user2.levelAccess = 10;

        Users users = new Users();
        users.addUser(user);
        users.addUser(user2);

        User openbootcamp = users.getUser("Open2");
        System.out.println(openbootcamp.email);

        users.deleteUser("Open2");
        for (User existingUser : users.userList()) {
            System.out.println(existingUser.name);
        }
    }
}
