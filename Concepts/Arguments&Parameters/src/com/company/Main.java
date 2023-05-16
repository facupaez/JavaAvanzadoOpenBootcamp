package com.company;

/**
 *
 * Tema: Argumentos.
 * Los argumentos de entrada son una serie de parámetros que le pasamos a nuestros programas tanto al ejecutarlos
 * como al invocarlos desde un entorno de desarollo. Estos parámetros modifican el comportamiento de nuestro programa.
 */
public class Main {

    public static void main(String[] args) {

        // en la configuración del ejecutable main de intellij agregamos 3 parámetros de entrada
        System.out.println(args.length);

        // recorremos argumentos
        for (String arg : args){
            System.out.println("El argumento es: " + arg);
        }

        // segun parámetros de entrada podemos alterar el comportamiento de nuestro programa
        if (args[0].equalsIgnoreCase("arg1")){
            System.out.println("Argumento uno");
        }else if (args[0].equalsIgnoreCase("arg2")){
            System.out.println("Argumento dos");
        }

        // leyendo argumentos "opcion = valor"
        int optionMinVal = 0;
        int optionMaxVal = 0;

        for (int i = 0; i < args.length; i++){
            switch (args[i]){
                case "--minval":
                    optionMinVal = Integer.parseInt(args[i+1]);
                    i++;
                    break;
                case "--maxval":
                    optionMaxVal = Integer.parseInt(args[i+1]);
                    i++;
                    break;
            }
        }

        System.out.println("Valor de minval es: " + optionMinVal);
        System.out.println("Valor de maxval es: " + optionMaxVal);
    }
}
