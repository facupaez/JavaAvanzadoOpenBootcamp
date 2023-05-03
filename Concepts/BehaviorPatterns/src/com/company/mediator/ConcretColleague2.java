package com.company.mediator;

public class ConcretColleague2 extends Colleague {
    @Override
    void receive() {
        System.out.println("He recibido un mensaje, soy colega concreto 2");
    }

    @Override
    void send() {
        System.out.println("Soy colega contreto 2 enviando el mensaje.");
        // envio el mensaje invocando al mediador
        mediator.forwards(this);
    }
}
