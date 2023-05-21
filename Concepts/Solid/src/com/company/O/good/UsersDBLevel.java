package com.company.O.good;

/**
 * Creamos nueva clase para extender de UsersDB y poder modificar aplicando el principio de abierto/cerrado.
 * En esta clase aplicaremos un nivel de jerarquía a cada usuario.
 */
public class UsersDBLevel extends Users{

    public boolean isAdmin(User user){
        return checkLevel(user, 10);
    }

    public boolean isStudent(User user){
        return checkLevel(user, 5);
    }

    public boolean isGuest(User user){
       return checkLevel(user, 1);
    }

    private boolean checkLevel(User user, int level){
        if(usersDB.getUser(user) == null || user.levelAccess != level) return  false;

        return true;
    }
}
