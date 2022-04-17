package org.sebas.generics.classgenerics;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Animal {

    private String nombre;
    private String tipo;

    public Animal(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}
