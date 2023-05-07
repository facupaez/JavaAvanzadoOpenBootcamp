package com.company;

import java.util.ArrayList;

public class Users {

    private ArrayList<User> users = new ArrayList();


    // no usaremos prints para el seguimiento de errores, usaremos excepciones a través de la palabra throws
    public void createUser(User user) throws UserException {
        if (users.contains(user)) {
            throw new UserException("Usuario ya existe: " + user.firstName);
        }

        users.add(user);
    }
}
