package com.company.I.good;

import java.util.ArrayList;

/*
    Creamos nueva interface para centralizar métodos de la base de datos.
 */
public interface IUsersDB {
    abstract ArrayList<User> listUsers();

    abstract User getUser(User user);

    abstract void addUser(User user);

    abstract void deleteUser(User user);
}
