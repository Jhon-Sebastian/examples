package org.sebas.generics.classgenerics;

import static org.sebas.generics.classgenerics.TipoAnimal.CABALLO;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class MainGenericos {
    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.addObject(new Animal("Jose", CABALLO.getTipoAnimal()));
        transporteCaballos.addObject(new Animal("Pepe", CABALLO.getTipoAnimal()));
        transporteCaballos.addObject(new Animal("Gruillo", CABALLO.getTipoAnimal()));
        transporteCaballos.addObject(new Animal("Tuquen", CABALLO.getTipoAnimal()));
        transporteCaballos.addObject(new Animal("TopoCalma", CABALLO.getTipoAnimal()));

        Camion<Maquinaria> trasnporteMaquinas = new Camion<>(3);
        trasnporteMaquinas.addObject(new Maquinaria("Recolector"));
        trasnporteMaquinas.addObject(new Maquinaria("Grua"));
        trasnporteMaquinas.addObject(new Maquinaria("Aplanador"));

        Camion<Automovil> trasnporteAutomoviles = new Camion<>(3);
        trasnporteAutomoviles.addObject(new Automovil("BMW"));
        trasnporteAutomoviles.addObject(new Automovil("Rolls Royce"));
        trasnporteAutomoviles.addObject(new Automovil("Mercedez"));

        System.out.println("\nANIMALES");
        imprimirCamion(transporteCaballos);

        System.out.println("\nMAQUINAS");
        imprimirCamion(trasnporteMaquinas);

        System.out.println("\nAUTOMOVILES");
        imprimirCamion(trasnporteAutomoviles);


    }

    public static <T> void imprimirCamion(Camion<T> transporte) {
        for (T object : transporte) {
            if (object instanceof Animal) {
                Animal a = (Animal) object;
                System.out.println(a.getNombre() + ", tipo= " + a.getTipo());
            }
            if (object instanceof Maquinaria) {
                Maquinaria m = (Maquinaria) object;
                System.out.println("Tipo= " + m.getTipo());
            }
            if (object instanceof Automovil) {
                Automovil a = (Automovil) object;
                System.out.println("Marca= " + a.getMarca());
            }
        }
    }
}
