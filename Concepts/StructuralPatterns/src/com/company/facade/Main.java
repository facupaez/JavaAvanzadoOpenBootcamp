package com.company.facade;

import java.io.File;

/**
 * @author Facu Paez
 * Tema: Patrones estructurales.
 * El patron Facade oculta la complejidad del código y simplifica este código en otra clase que esta a la vista.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        // utilizando facade
        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("fichero.ogg", "mp4");
    }
}
