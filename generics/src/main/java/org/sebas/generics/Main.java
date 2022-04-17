package org.sebas.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author jhonc
 * @version 1.0
 * @since 11/04/2022
 */
public class Main {

    /*
        TODO -> Bounded Generics
        @Info
        Limita las posibles opciones a retornar o ingresar ya que indica que el
        objeto generico debe extender de Number por lo cual debe ser
        [Double, Float, Long, Integer, Short, Byte] ademas de que deben implementar
        la interfaz Comparable, la cual de por si ya implementan

        @return
        <T extends Number & Comparable<T>>


        TODO -> Wilcards Generics en Listas
        @Info
        En las listas no funciona la herencia como normalmente lo hacen los objetos
        por lo tanto se indica <? extends Cliente> lo cual significa que acepta objetos
        de tipo Cliente y sus Hijos

        @return
        <? extends Cliente>
     */

    public static void main(String[] args) {

        List<String> clientes = new ArrayList<>();
        clientes.add("Andres");

//      String nombre = clientes.get(0);
        String nombre = clientes.iterator().next();

        String[] clientesArreglo = {"Luci Martinez", "Jose Luis", "David Luis"};
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Clientes=");
        fromArrayToList(clientesArreglo).forEach(System.out::print);
        System.out.println("Enteros=");
        fromArrayToList(enteros).forEach(System.out::print);

        System.out.println("\n\n*****Nombres=");
        List<String> nombres = fromArrayToList(new String[]{"Carlos", "Adriana", "Lilia"}
                , new Double[]{1.2, 2.4, 5.6, 8.9});
        nombres.forEach(System.out::println);




        imprimirClientes(nombres);
        imprimirClientes(clientes);

        System.out.println("Maximo de 1,9 y 4 es: " + objetoMaximo(1,9,4));
        System.out.println("Maximo de 3.9, 11.3, 7.68 es: " + objetoMaximo(3.9,11.3,7.68));
        System.out.println("Maximo de zanahoria, arandanos, manzana es: "
                + objetoMaximo("zahanoria","arandanos","manzana"));

    }

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number & Comparable<T>> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T, G> List<T> fromArrayToList(T[] c, G[] x) {
        for (G elemento : x) {
            System.out.println(elemento);
        }
        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends String> clientes){
        clientes.forEach(System.out::println);
    }


    public static <T extends Comparable<T>> T objetoMaximo(T a, T b, T c){
        T max = a;
        if(b.compareTo(max) > 0){
            max = b;
        }
        if(c.compareTo(max) > 0){
            max = c;
        }
        return max;
    }

}
