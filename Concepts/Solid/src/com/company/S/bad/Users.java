package com.company.S.bad;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

    /*
     En este caso la clase usuarios está ejecutando tareas múltiples que no le corresponden
     */
public class Users {

    public String dataFile = "usuarios.txt";

    private ArrayList<User> convertFileUsersIntoArrayList() {
        ArrayList<User> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(dataFile));

            while (scanner.hasNext()) {
                String actualUser = scanner.next();
                String []partes = actualUser.split(",");

                User user = new User();
                user.name = partes[0];
                user.lastName = partes[1];
                user.email = partes[2];
                user.levelAccess = Integer.parseInt(partes[3]);

                users.add(user);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return users;
    }

    public ArrayList<User> userList() {
        return convertFileUsersIntoArrayList();
    }

    public User getUser(String name) {
        ArrayList<User> users = convertFileUsersIntoArrayList();

        for (User usuarioActual : users) {
            if (usuarioActual.name.equalsIgnoreCase(name)) {
                return usuarioActual;
            }
        }

        return null;
    }

    public void addUser(User user) {
        if (getUser(user.name) != null) {
            return;
        }

        try {
            PrintStream printStream = new PrintStream(dataFile);

            for (User existingUser : convertFileUsersIntoArrayList()) {
                printStream.println(separateUserByCommas(existingUser));
            }

            printStream.println(separateUserByCommas(user));
        } catch (Exception e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    private String separateUserByCommas(User user) {
        return user.name + ","
                + user.lastName + ","
                + user.email + ","
                + user.levelAccess;
    }

    public void deleteUser(String name) {
        ArrayList<User> users = convertFileUsersIntoArrayList();

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).name.equalsIgnoreCase(name)) {
                users.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(dataFile);

            for (User existingUser : users) {
                String commasUser = separateUserByCommas(existingUser);
                printStream.println(commasUser);
            }
        } catch (Exception e) {
        }
    }
}
