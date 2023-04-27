package com.example.demo.services;

import com.example.demo.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Facu Paez
 * Esta clase es la parte lógica de la app que comunica las clases del controlador con las clases del modelo.
 * Debemos agregarle la anotación Service.
 * @version 1.0
 */

@Service
public class BootcamperService {

    // creamos lista de bootcampers
    private List<Bootcamper> bootcampers = new ArrayList<>();

    // creamos método que nos devuelve la lista de bootcampers
    public List<Bootcamper> getAll(){
        return  bootcampers;
    }

    // creamos método para agregar bootcampers
    public void add(Bootcamper bootcamper){
        bootcampers.add(bootcamper);
    }

    public Bootcamper getByName(String name){
        for(Bootcamper bootcamper : bootcampers){
            if(bootcamper.getNombre().equalsIgnoreCase(name)) return bootcamper;
        }
        return null;
    }
}
