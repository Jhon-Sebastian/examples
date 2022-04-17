package org.sebas.generics.tarea;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class BolsaSupermercado<T> {

    private List<T> productos;
    private final int MAX_ELEMENTOS = 5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }

    public void addProducto(T p) {
        if (this.productos.size() <= MAX_ELEMENTOS) {
            this.productos.add(p);
        }else{
            throw new RuntimeException("Excedio el limite de productos permitidos!");
        }
    }

    public List<T> getProductos() {
        return this.productos;
    }
}
