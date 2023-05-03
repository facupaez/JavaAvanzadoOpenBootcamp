package com.company.mediator;

public abstract class Mediator {

    // registra a un hablante
    abstract void  register(Colleague colleague);

    // reenvia el mensaje del hablante
    abstract void forwards(Colleague colleague);
}
