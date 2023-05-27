package com.example.CleanArchitecture.controllers;

import com.example.CleanArchitecture.entities.User;
import com.example.CleanArchitecture.services.UsersService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class UsersController {
    private final UsersService usersService;

    public UsersController(UsersService usersService){this.usersService = usersService;}

    // listar todos los usuarios
    @GET
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> listAllUsers(){
        return usersService.listUsers();
    }

    // listar usuario por nombre
    @GET
    @Path("/users/{name}")
    @Produces(MediaType.APPLICATION_JSON)
    public User getUser(@PathParam("name") String name){
        return usersService.getUser(name);
    }

    // agregar usuario
    @POST
    @Path("/users")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addUser(User user){
        usersService.addUser(user);

        return Response.created(URI.create("/users" + user.userName)).build();
    }

    // eliminar usuario
    @DELETE
    @Path("/users/{name}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response deleteUser(@PathParam("name") String name){
        usersService.deleteUser(name);

        return Response.ok().build();
    }


}
