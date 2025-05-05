
package com.mycompany.polimorfismoperrogato;

public abstract class Animal implements Ruidoso{
    private String raza;
    private String nombre;
    private int edad;
    public Animal() {
    }

    public Animal(String raza, String nombre, int edad) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return ("Hola, soy el animal " + nombre + " mi raza es: " + raza + " mi edad es: " + edad);
    }
    
    
}
