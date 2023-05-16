package com.company.leastKnowledgeDirective;

import java.util.ArrayList;

public class Users {

    String name;

    // relación b
    public Users(String name){
        ArrayList<String> list = new ArrayList<>();
        // relación a
        this.name = name;
        // relacion c
        // relacion d
        list.add(name);
    }

    // no permie hacer lo siguiente:
    // objeto cosa = new cosa();
    // cosa.getValue().getElementos.getSuperficiales();

    // permite hacer lo siguiente:
    // cosa.valores.elementos.superficiales();
}
