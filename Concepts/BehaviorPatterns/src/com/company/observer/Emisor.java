package com.company.observer;

import java.util.ArrayList;

public class Emisor {

    // creamos lista de receptores
    private ArrayList<IReceptor> receptors = new ArrayList<>();

    // agregamos receptores a la lista
    public void  addReceptor(IReceptor receptor){
        this.receptors.add(receptor);
    }

    // notificamos a todos nuestros receptores
    public void emit(){
        for (IReceptor receptor : receptors){
            receptor.receive();
        }
    }
}
