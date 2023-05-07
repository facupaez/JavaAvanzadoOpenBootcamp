package com.company;

import java.util.ArrayList;

/**
 * @author Facu Paez
 * Esta clase usuarios la utilizamos para crear la lista de usuarios y los métodos necesarios, en este caso
 * addUser y deleteUser.
 * @version 1.0
 * @since 07-05-2023
 */
public class Users {

    public ArrayList<User> users = new ArrayList<>();

    // Función diseñada para agregar varios usuarios a la vez.
    public void addUser(User... users) {
        for (User user : users) {
            this.users.add(user);
        }
    }

    // Función diseñada para elimiar un usuario a la vez.
    public void deleteUser(User user) {
        users.remove(user);
    }

    // Función diseñada para calcular el total de años de los usuarios existentes en la lista.
    public int sumOfYears(User... users) {
        int result = 0;
        for (User user : users) {
            result += user.age;
            ;
        }
        return result;
    }
}
