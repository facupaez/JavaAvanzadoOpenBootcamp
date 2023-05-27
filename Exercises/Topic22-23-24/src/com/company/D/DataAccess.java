package com.company.D;

public class DataAccess {
    private Connection connection;

    public DataAccess(Connection connection){
        this.connection = connection;
    }

    BDAccess getData(){
        return connection.getData();
    }
}
