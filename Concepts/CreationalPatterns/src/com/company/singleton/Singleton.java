package com.company.singleton;


public class Singleton {
    private static Singleton singleton;
    int count;

    // creamos constructor private para no poder instanciar la clase desde otra clase.
    private Singleton(){}

    // creamos metodo Singleton, si este metodo no se ha invocado previamente la variable singleton sera null,
    // si es null asignamos una nueva instancia de la variable singleton,
    // si no es null quiere decir que ya se ha creado esta instancia previamente y devolvera esta instancia en vez de crear una nueva.
    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
