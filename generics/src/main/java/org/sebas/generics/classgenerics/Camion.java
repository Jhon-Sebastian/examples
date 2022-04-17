package org.sebas.generics.classgenerics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class Camion<T> implements Iterable<T> {

    private List<T> objetos;
    private int max;

    public Camion(int max) {
        this.max = max;
        this.objetos = new ArrayList<>();
    }

    public void addObject(T o) {
        if (this.objetos.size() <= max) {
            this.objetos.add(o);
        } else {
            throw new RuntimeException("No hay mas espacio!");
        }
    }

    @Override
    public Iterator<T> iterator() {
        return this.objetos.iterator();
    }
}
