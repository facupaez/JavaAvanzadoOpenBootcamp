package com.company.strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUsers implements Users{
    private String fileUsers = "users.text";
    private PrintStream file;

    public FileUsers() {
        try {
            file = new PrintStream((fileUsers));
        } catch (FileNotFoundException e) {
            System.out.println("No puedo abrir el fichero: " + e.getMessage());
        }
    }

    @Override
    public void add(String name) {
        file.println((name));
    }

    @Override
    public ArrayList<String> listAll() {
        ArrayList<String> users = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(fileUsers));

            while (scanner.hasNext()){
                users.add(scanner.next());
            }
        }catch (Exception e){
            System.out.println("Error leyendo: " + e.getMessage());
        }

        return users;
    }
}
