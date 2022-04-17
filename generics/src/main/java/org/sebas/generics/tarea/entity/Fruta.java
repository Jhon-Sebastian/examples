package org.sebas.generics.tarea.entity;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Fruta extends Producto{

    private double peso;
    private String color;

    public Fruta(String nombre, Double precio, double peso, String color) {
        super(nombre, precio);
        this.peso = peso;
        this.color = color;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
