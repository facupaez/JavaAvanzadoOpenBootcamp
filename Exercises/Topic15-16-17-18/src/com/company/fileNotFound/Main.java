package com.company.fileNotFound;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Facu Paez
 * Trabajando con excepciones debemos implementar:
 * FileNotFound tratando de acceder a un fichero que no existe.
 */
public class Main {

    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("Test.txt");
            BufferedReader bufferReader = new BufferedReader(fileReader);
            String fileData = null;

            while ((fileData = bufferReader.readLine()) != null) {
                System.out.println(fileData);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
