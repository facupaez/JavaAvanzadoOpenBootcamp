package com.company;

public class MainParser {

    public static void main(String[] args) {

        OptionsParser optionsParser = new OptionsParser(args);
        optionsParser.addOption("minval");
        optionsParser.addOption("maxval");
        optionsParser.parse();

        String minVal = optionsParser.getOption("minval");
        System.out.println("Min val es: " + minVal);

    }
}
