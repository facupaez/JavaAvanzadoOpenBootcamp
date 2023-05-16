package com.company.DTO;

/**
 * @author Facu Paez
 * Tema: Data transfers objects (DTO)
 * Nos permiten obtener información de varias clases en una única llamada.
 * Se utiliza mucho en el ámbito de las bases de datos.
 */
public class Main {

    public static void main(String[] args) {
        User user = new User("Juan");
        user.addVehicle(new Vehicle("Honda"));

        User user1 = new User("Pepe");
        user1.addVehicle(new Vehicle("Mazda"));
        user1.addVehicle(new Vehicle("Toyota"));

        Users users = new Users();
        users.addUser(user);
        users.addUser(user1);

        User userInfo = users.getUser("Pepe");
        // accedemos directamente a las propiedades del usuario solicitado
        System.out.println(userInfo.name);

        for (Vehicle vehicle : userInfo.vehicles){
            System.out.println(vehicle.brand);
        }

    }
}
