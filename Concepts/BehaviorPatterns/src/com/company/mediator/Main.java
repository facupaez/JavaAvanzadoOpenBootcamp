package com.company.mediator;

/**
 * @author Facu Paez
 * Tema: Patrones de comportamiento.
 * El patrón mediator actúa de mediador de comunicador entre dos objetos.
 * Si tenemos 5 clases y deben comunicarse entre sí, utilizariamos una clase mediadora la cual actúa de puente de
 * información.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // creamos objeto mediador
        Mediator mediator = new ConcretMediator();

        // creamos objetos colegas
        Colleague colleague1 = new ConcretColleague1();
        Colleague colleague2 = new ConcretColleague2();
        Colleague colleague3 = new ConcretColleague3();

        // agregamos los colegas a la lista del mediador
        mediator.register(colleague1);
        mediator.register(colleague2);
        mediator.register(colleague3);

        // enviamos mensaje desde colegas, sin que este, lo reciba
        // solo lo reciben los demas colegas que estan escuchando
        colleague1.send();
        colleague2.send();
        colleague3.send();
    }
}
