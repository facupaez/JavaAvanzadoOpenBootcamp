package com.company.mediator;

public class ConcretColleague1 extends Colleague{
    @Override
    void receive() {
        System.out.println("He recibido un mensaje, soy colega concreto 1");
    }

    @Override
    void send() {
        System.out.println("Soy colega contreto 1 enviando el mensaje.");
        // envio el mensaje invocando al mediador
        mediator.forwards(this);
    }
}
