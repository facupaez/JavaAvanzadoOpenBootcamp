package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Facu Paez
 * Tema: Servicios REST.
 * Son tipos de peticiones que enviamos al servidor utilizando el protocolo HTTP.
 * Verbos implementados: GET, POST, PUT, DELETE.
 * GET: Obtiene información/recursos de un servidor.
 * POST: Envio de información/recursos de un servidor.
 * PUT: Modifica información/recursos existente de un servidor.
 * DELETE: Elimina información/recursos existente de un servidor.
 * @version 1.0
 */
@SpringBootApplication
public class RestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServicesApplication.class, args);
	}

}
