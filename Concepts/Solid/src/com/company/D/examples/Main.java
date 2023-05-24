package com.company.D.examples;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Pancho");

        // independientemente del objeto que instanciemos le tiene que dar lo mismo al metodo saveInDatabase()
        // porque estamos implementando la interface de usuario
        IDatabaseStore db = new DatabaseSQLite();

        // creamos "wrapper"
        saveInDatabase(db, user);
    }

    private static void saveInDatabase(IDatabaseStore dbs, User user) {
        dbs.save(user);
    }
}
