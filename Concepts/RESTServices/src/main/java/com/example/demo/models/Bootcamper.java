package com.example.demo.models;

/**
 * @author Facu Paez
 * Clase modelo Bootcamper la cual utilizaremos para manipular la información que usaremos.
 * Atributos: nombre.
 * @version 1.0
 */
public class Bootcamper {

    private String nombre;

    public Bootcamper(){}

    public Bootcamper(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}
