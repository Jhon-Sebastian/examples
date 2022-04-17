package org.sebas.generics.tarea.entity;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Limpieza extends Producto{

    private String componentes;
    private double litros;

    public Limpieza(String nombre, Double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public void setComponentes(String componentes) {
        this.componentes = componentes;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }
}
