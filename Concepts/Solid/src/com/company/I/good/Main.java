package com.company.I.good;


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

        IUsersDB iUsersDB;

        String test = "memory";
        if (test.equalsIgnoreCase("file")){
            iUsersDB = new UsersDBFile();
        }else{
            iUsersDB = new UsersDBMemory();
        }

        Users users = new Users(iUsersDB);
        users.addUser(user);
        users.addUser(user2);

        for (User existingUser : users.userList()) {
            System.out.println("Usuario actual: " + existingUser.userName);
            System.out.println(existingUser);
            System.out.println();
        }


        printStatistics(iUsersDB);
    }

    private static void printStatistics(IUsersDB iUsersDB) {
        // si el objeto que le pasamos es de tipo UsersDBMemory llama a los nuevos métodos.
        if (iUsersDB instanceof UsersDBMemory){
            System.out.println("Inserciones: " + ((UsersDBMemory) iUsersDB).getTotalInsertions());
            System.out.println("Eliminaciones: " + ((UsersDBMemory) iUsersDB).getTotalDeletes());
        }
    }
}
