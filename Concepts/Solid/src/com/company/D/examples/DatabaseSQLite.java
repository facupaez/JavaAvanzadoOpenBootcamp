package com.company.D.examples;

public class DatabaseSQLite implements IDatabaseStore{
    @Override
    public void save(User user) {
        System.out.println("Estoy save() en DatabaseSQLite");
    }
}
