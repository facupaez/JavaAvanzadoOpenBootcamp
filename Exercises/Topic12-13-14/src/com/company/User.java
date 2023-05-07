package com.company;

/**
 * @author Facu Paez
 * Clase objeto usuario, con sus propeidades, constructor y metodo toString.
 * Esta clase la utilizamos para poder crear objetos de tipo usuario.
 * @version 1.0
 * @since 07-05-2023
 */
public class User {

    String name;
    String password;
    int age;

    public User(String name, String password, int age){
        this.name = name;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
