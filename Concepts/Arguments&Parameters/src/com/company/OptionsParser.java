package com.company;

import java.util.HashMap;

/**
 * @author Facu Paez
 * En este parser lo que haremos será crear una serie de funciones que:
 * Nos permitan definir opciones en nuestro parser.
 * Nos permitan fijar su valor.
 * Nos permitan analizar y obtener el valor si la opcián existe.
 */
public class OptionsParser {
    private HashMap<String, String> options = new HashMap<>();
    private String[] args;

    private OptionsParser(){}

    public OptionsParser(String[] args){
        this.args = args;
    }

    // registrar opción al hashmap

    public void addOption(String optionName){
        options.put(optionName, "");
    }

    // obtener opción del hashmap
    public String getOption(String optionName){
        return options.get(optionName);
    }

    // asociar valor a una opción
    public void setOptionValue(String optionName, String optionValue){
        options.replace(optionName, optionValue);
    }

    // leemos argumentos de entrada, y sobre cada argumento iteramos.
    // si existe la opción registrada modificamos el hashmap para ponerle nombre de opción = valor
    public void parse(){
        for (int i = 0; i < args.length; i++){
            // eliminamos guiones del hashmap
            String optionName = args[i].replace("-", "");

            if (options.containsKey(optionName)){
                setOptionValue(optionName, args[i+1]);
            }
        }
    }
}
