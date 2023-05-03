package com.company.mediator;

public abstract class Colleague {

    public Mediator mediator;

    public void setMediator(Mediator mediator){
        this.mediator = mediator;
    }

    abstract void receive();

    abstract void send();
}
