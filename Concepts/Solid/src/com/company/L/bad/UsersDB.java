package com.company.L.bad;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class UsersDB {

    public String dataFile = "usuarios.txt";

    public ArrayList<User> convertFileUsersIntoArrayList() {
        ArrayList<User> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(dataFile));

            while (scanner.hasNext()) {
                String actualUser = scanner.next();
                String []parts = actualUser.split(",");

                User user = new User();
                user.userName = parts[0];
                user.name = parts[1];
                user.lastName = parts[2];
                user.email = parts[3];
                user.levelAccess = Integer.parseInt(parts[4]);

                users.add(user);
            }

            scanner.close();
        } catch (Exception e) {
            System.out.println("Error al convertir usuario: " + e.getMessage());

        }

        return users;
    }

    public User getUser(User user) {
        ArrayList<User> users = convertFileUsersIntoArrayList();

        for (User usuarioActual : users) {
            if (usuarioActual.userName.equalsIgnoreCase(user.userName)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void addUser(User user){
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(dataFile, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separateUserByCommas(user));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
        }
    }

    private String separateUserByCommas(User user) {
        return user.userName + ","
                + user.name + ","
                + user.lastName + ","
                + user.email + ","
                + user.levelAccess;
    }

    public void deleteUser(User user){
        ArrayList<User> users = convertFileUsersIntoArrayList();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).userName.equalsIgnoreCase(user.userName)) {
                users.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(dataFile);

            for (User existingUser : users) {
                String commasUser = separateUserByCommas(existingUser);
                printStream.println(commasUser);
            }

            printStream.close();
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());

        }
    }
}
