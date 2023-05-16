package com.company.cleaningProyect.dirtyClasses;

import java.io.File;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Users {
    public String dataFile = "usuarios.txt";

    public ArrayList<User> userList() {
        ArrayList<User> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(dataFile));

            while (scanner.hasNext()) {
                String existingUser = scanner.next();
                String []parts = existingUser.split(",");

                User user = new User();
                user.name = parts[0];
                user.lastName = parts[1];
                user.email = parts[2];
                user.levelAccess = Integer.parseInt(parts[3]);

                users.add(user);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return users;
    }

    public User getUser(String name) {
        try {
            Scanner scanner = new Scanner(new File(dataFile));
            ArrayList<String> users = new ArrayList();

            while (scanner.hasNext()) {
                users.add(scanner.next());
            }

            scanner.close();

            for (String usuario : users) {
                String []partes = usuario.split(",");
                String nombreUsuarioActual = partes[0];
                System.out.println(name + " " + nombreUsuarioActual);

                if (!nombreUsuarioActual.equalsIgnoreCase(name)) {
                    continue;
                }

                User returnUser = new User();
                returnUser.name = partes[0];
                returnUser.lastName = partes[1];
                returnUser.email = partes[2];
                returnUser.levelAccess = Integer.parseInt(partes[3]);
                return returnUser;
            }

        } catch (Exception e) {
        }

        return null;
    }

    public void addUser(User user) {
        try {
            Scanner scanner = new Scanner(new File(dataFile));
            ArrayList<String> users = new ArrayList();

            while (scanner.hasNext()) {
                users.add(scanner.next());
            }

            scanner.close();

            for (String existingUser : users) {
                String []parts = existingUser.split(",");
                String existingUsername = parts[0];

                if (existingUsername.toLowerCase().equals(user.name.toLowerCase())) {
                    return;
                }
            }
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(dataFile);
            String buffer = "";

            for (User existingUser : userList()) {
                buffer += existingUser.name + ","
                        + existingUser.lastName + ","
                        + existingUser.email + ","
                        + existingUser.levelAccess;
            }

            buffer += user.name + ","
                    + user.lastName + ","
                    + user.email + ","
                    + user.levelAccess;

            printStream.println(buffer);
        } catch (Exception e) {

        }
    }

    public void addOldUser(User user) {
        try {
            PrintStream printStream = new PrintStream(dataFile);
            printStream.println(user.name + ","
                    + user.lastName + ","
                    + user.email + ","
                    + user.levelAccess);

        } catch (Exception e) {
        }
    }

    public void deleteUser(String name) {
        ArrayList<String> users = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(dataFile));

            while (scanner.hasNext()) {
                users.add(scanner.next());
            }

            scanner.close();
        } catch (Exception e) {
        }

        try {
            PrintStream printStream = new PrintStream(dataFile);

            for (String existingUser : users) {
                String[] parts = existingUser.split(",");
                String existingUsername = parts[0];

                if (existingUsername.toLowerCase().equals(name)) {
                    continue;
                }

                printStream.println(parts[0] + ","
                        + parts[1] + ","
                        + parts[2] + ","
                        + parts[3]);
            }
        } catch (Exception e) {
        }
    }
}
