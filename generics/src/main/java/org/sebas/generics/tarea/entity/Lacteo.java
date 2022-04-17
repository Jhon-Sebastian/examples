package org.sebas.generics.tarea.entity;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Lacteo extends Producto{

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas) {
        super(nombre,precio);
        this.cantidad = cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }
}
