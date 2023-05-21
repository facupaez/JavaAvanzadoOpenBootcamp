package com.company.O.good;


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

        Users users = new Users();
        users.addUser(user);
        users.addUser(user2);

        //User openbootcamp = users.getUser("Open2");
        //System.out.println(openbootcamp.email);

        //users.deleteUser("openbootcamp2");


        for (User existingUser : users.userList()) {
            System.out.println("Usuario actual: " + existingUser.userName);
            System.out.println(existingUser);
            System.out.println();
        }

        // usando clase UsersDBLevel
        UsersDBLevel usersDBLevel = new UsersDBLevel();
        System.out.println("Es administrador: " + usersDBLevel.isAdmin(user));
        System.out.println("Es administrador: " + usersDBLevel.isAdmin(user2));
        System.out.println();

        // usando clase UsersDBStatistics
        System.out.println("Total inserciones " + users.usersDB.getTotalInserted());
        System.out.println("Total eliminados " + users.usersDB.getTotalDeleted());
    }
}
