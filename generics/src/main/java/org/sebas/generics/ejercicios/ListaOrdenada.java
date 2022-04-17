package org.sebas.generics.ejercicios;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jhonc
 * @version 1.0
 * @since 17/04/2022
 */
public class ListaOrdenada<E extends Comparable<E>> {

    private List<E> list;
    private int index = 0;

    public ListaOrdenada() {
        this.list = new ArrayList<>();
    }

    public void addObject(E object) {
        if (!(list.contains(object))) {
            list.add(index,object);
            index++;
        } else {
            throw new RuntimeException("El objeto ya existe en la lista: " + object);
        }
    }

    public E getObject(int index) {
        if (list.contains(list.get(index))) {
            return list.get(index);
        } else {
            throw new RuntimeException("No existe el objeto con el id: " + index);
        }
    }

    public int size() {
        return list.size();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public boolean remove(E object) {
        if (object != null) {
            return list.remove(object);
        }
        return false;
    }

    public int indexOf(E object) {
        if (list.contains(object)) {
            return list.indexOf(object);
        } else {
            throw new RuntimeException("El indice del objeto a buscar no existe");
        }
    }

    public void listToString() {
        list.sort(Comparable::compareTo);
        list.forEach(System.out::println);
    }

}

class EjemploClaseMain{
    public static void main(String[] args) {
        ListaOrdenada<Integer> listaOrdenadaNumeros = new ListaOrdenada<>();
        listaOrdenadaNumeros.addObject(5);
        listaOrdenadaNumeros.addObject(2);
        listaOrdenadaNumeros.addObject(9);
        listaOrdenadaNumeros.addObject(1);

        System.out.println("Objeto: " + listaOrdenadaNumeros.getObject(0));

        listaOrdenadaNumeros.listToString();
    }
}
