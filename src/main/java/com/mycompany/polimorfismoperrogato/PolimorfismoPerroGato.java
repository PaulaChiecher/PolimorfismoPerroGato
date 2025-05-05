
package com.mycompany.polimorfismoperrogato;


public class PolimorfismoPerroGato {

    public static void main(String[] args) {
        var Perro1 = new Perro();
        Perro1.HacerRuido();
        Perro1.setNombre("Puqui");
        Perro1.setRaza("Caniche");
        Perro1.setEdad(13);
        System.out.println(Perro1.toString());
    }
}
