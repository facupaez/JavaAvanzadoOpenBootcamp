package com.example.demo.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import javax.ws.rs.ApplicationPath;

/**
 * @author Facu Paez
 * Creamos una clase JerseyConfig y lo configuramos para mapear la ruta de los controladores.
 * Debemos agregarle las anotaciones Component y ApplicationPath.
 * @version 1.0
 */
@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig(){
        this.packages("com.example.demo.controllers");
    }
}
