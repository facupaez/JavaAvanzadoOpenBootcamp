package com.company.mediator;

import java.util.ArrayList;

// implementamos a la clase Mediator
public class ConcretMediator extends Mediator {

    // creamos lista de colegas
    ArrayList<Colleague> colleagues = new ArrayList<>();

    @Override
    void register(Colleague colleague) {
        // no permitimos el envio de informacion duplicada
        if(!colleagues.contains(colleague)){
            colleagues.add(colleague);
            // seteamos al mediador ConcretMediator con la palabra this
            colleague.setMediator(this);
        }
    }

    @Override
    void forwards(Colleague colleague) {
        for(Colleague current : colleagues){
            // compruebo que el emisor no sea el que recibe el mensaje
            if(!current.equals(colleague)){
                current.receive();
            }
        }
    }
}
