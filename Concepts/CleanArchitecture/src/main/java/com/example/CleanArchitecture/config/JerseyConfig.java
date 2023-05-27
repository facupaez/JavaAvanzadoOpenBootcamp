package com.example.CleanArchitecture.config;

import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@ApplicationPath("/")
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        // cohesionando peticiones web con controladores
        this.packages("com.example.CleanArchitecture.controllers");
    }
}
