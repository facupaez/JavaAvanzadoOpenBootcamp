package com.company.observer;

/**
 * @author Facu Paez
 * Tema: Patrones de comportamiento.
 * El patrón observer es un patrón OneToMany, este hace que un emisor hable y muchos receptores escuchen.
 * Cuando se produce un evento, los subscriptores de ese evento reaccionan ante lo que ocurre.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // creamos objeto emisor
        Emisor emisor = new Emisor();

        // creamos objetos receptores
        RadioIReceptor radioIReceptor = new RadioIReceptor();
        SateliteIReceptor sateliteIReceptor = new SateliteIReceptor();
        TVReceptor tvReceptor = new TVReceptor();

        // agregamos receptores a la lista del emisor
        emisor.addReceptor(radioIReceptor);
        emisor.addReceptor(sateliteIReceptor);
        emisor.addReceptor(tvReceptor);

        // enviamos señal a todos los receptores
        emisor.emit();
    }
}
