package com.company;

/**
 * @author Facu Paez
 * En este proyecto realizaremos ejercicios del curso de Java Avanzado de Open Bootcamp.
 * Repasaremos el diseño de funciones limpias y el buen uso de comentarios y documentación.
 * @version 1.0
 * @since 07-05-2023
 */
public class Main {

    public static void main(String[] args) {

        User user1 = new User("Pepe", "doctorpepe", 14);
        User user2 = new User("Richard", "doctorrichard", 18);
        User user3 = new User("Oscar", "doctoroscar", 56);

        // instanciamos una nueva lista de la clase Users para poder agregar usuarios.
        Users userList = new Users();

        userList.addUser(user1, user2, user3);

        for (User user : userList.users){
            System.out.println(user);
        }

        userList.deleteUser(user1);
        System.out.println("Eliminando usuario... " + user1.name + " de la lista de usuarios.");

        for (User user : userList.users){
            System.out.println(user);
        }

        int sumOfYears = userList.sumOfYears(user1, user2, user3);
        System.out.println(sumOfYears);
    }
}
