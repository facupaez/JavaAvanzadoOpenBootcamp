package com.company.statePattern;

public class Telephone {
    public Status status;

    public Telephone(){
        // asignamos un estado inicial
        status = new LockStatus(this);
    }

    public void changeStatus(Status status){
        // cambia el estado
        System.out.println("Estado inicial: " + this.status.getClass().getName());
        this.status = status;
        System.out.println("Estado final: " + this.status.getClass().getName());
    }

    // retorna el estado actual
    public Status getStatus(){
        return status;
    }
}
