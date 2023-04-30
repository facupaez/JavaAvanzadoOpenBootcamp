package com.company.adapter;

/**
 * @author Facu Paez
 * Tema: Patrones estructurales.
 * El patrón adapter crea una clase que permite que otras clases con la misma implementación y con distinta
 * implementación funcionen coherentemente.
 * Por ejemplo un enchufe adaptador, el cual se adapta a distintos enchufes necesarios.
 * Muy utilizada con código legacy el cual heredamos y no podemos modificar el código escrito.
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {

        Oven oven = new Oven();
        Lamp lamp = new Lamp();
        // instanciamos clase distinta con la clase Adapter
        Adapter otherLamp = new Adapter();

        on(oven);
        on(lamp);
        // como a "otherLamp" la uso indirectamente a traves de mi adapter puedo pasarsela como parametro
        // a cualquier funcion que me requiera la interface puggable
        on(otherLamp);

        off(oven);
        off(lamp);
        off(otherLamp);

        System.out.println(isOn(oven));
        System.out.println(isOn(lamp));
        System.out.println(isOn(otherLamp));
    }

    // creamos metodos que reciban una instancia como parametro para realizar pruebas
    public static void on(IPluggable iPluggable){
        iPluggable.on();
    }

    public static void off(IPluggable iPluggable){
        iPluggable.off();
    }

    public static boolean isOn(IPluggable iPluggable){
        return iPluggable.isOn();
    }
}
