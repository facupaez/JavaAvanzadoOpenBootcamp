package com.example.CleanArchitecture.entities;

/*
    Creamos nueva clase para aplicar el patrón builder para simplificar la creación de usuarios y aplicar
    programación fluída.
 */
public class UsersBuilder {
    private User user = new User();

    private UsersBuilder(){}

    public UsersBuilder (String username){
        // Podemos inicializar variables en entidad o en builder.
        user.name = "";
        user.lastname = "";
        user.email = "";
        user.levelAccess = 0;
        user.username = username;
    }

    public UsersBuilder withName(String name){
        user.name = name;
        return this;
    }

    public UsersBuilder withLastname(String lastname){
        user.lastname = lastname;
        return this;
    }

    public UsersBuilder withEmail(String email){
        user.email = email;
        return this;
    }

    public UsersBuilder withLevelAccess(int levelAccess){
        user.levelAccess = levelAccess;
        return this;
    }

    public User build(){
        return user;
    }
}
