package com.company.O.good;

/**
 * Creamos nueva clase para extender de UsersDB y poder modificar aplicando el principio de abierto/cerrado.
 * En esta clase hacemos dos contadores para ver cuantos usuarios se han agregado y otro para ver cuantos se han eliminado.
 */
public class UsersDBStatistics extends UsersDB{
    private int totalInserted;
    private int totalDeleted;

    // agregando funcionalidades a la nueva clase

    @Override
    public void addUser(User user){
        super.addUser(user);
        totalInserted++;
    }

    @Override
    public void deleteUser(User user){
        super.deleteUser(user);
        totalDeleted++;
    }

    public int getTotalInserted() {
        return totalInserted;
    }

    public int getTotalDeleted() {
        return totalDeleted;
    }
}
