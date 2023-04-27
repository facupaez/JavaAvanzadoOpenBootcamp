package com.example.demo.controllers;

import com.example.demo.models.Bootcamper;
import com.example.demo.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

/**
 * @author Facu Paez
 * El controlador es la clase que recibe las peticiones por HTTP y las procesa.\
 * Este se comunica directamente con las clases del Service.
 * Debemos agregarle las anotaciones Component y Path.
 * @version 1.0
 */
@Component
@Path("/")
public class DemoController {

    private BootcamperService bootcamperService;

    public DemoController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.add(new Bootcamper("Juan"));
        this.bootcamperService.add(new Bootcamper("Pedro"));
        this.bootcamperService.add(new Bootcamper("Martín"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")

    public List<Bootcamper> findAll() {
        return bootcamperService.getAll();
    }
    // obtenemos lista de bootcampers, declaramos el endpoint y generamos la lista en json

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper findByName(@PathParam("name") String name){
        return bootcamperService.getByName(name);
    }

    // agregamos bootcamper, declaramos endpoint, creamos metodo Response
    // que reciba el dato en formato json y que lo genere en formato json.
    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response addBootcamper(Bootcamper bootcamper) {
        bootcamperService.add(bootcamper);

        return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
    }

}
