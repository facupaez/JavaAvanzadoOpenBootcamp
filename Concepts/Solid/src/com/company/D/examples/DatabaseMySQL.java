package com.company.D.examples;

public class DatabaseMySQL implements IDatabaseStore{
    @Override
    public void save(User user) {
        System.out.println("Estoy save() en DatabaseMySQL");
    }
}
