package com.company.L.good;

import java.util.ArrayList;

/*
    Creamos nueva clase abstracta para centralizar los métodos que se repiten en las clases existentes.
 */
abstract class UsersDB {
    abstract ArrayList<User> listUsers();

    abstract User getUser(User user);

    abstract void addUser(User user);

    abstract void deleteUser(User user);
}
