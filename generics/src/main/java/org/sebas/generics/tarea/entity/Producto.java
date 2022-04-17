package org.sebas.generics.tarea.entity;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Producto {
    protected String nombre;
    protected Double precio;

    public Producto(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public Double getPrecio() {
        return precio;
    }
}
