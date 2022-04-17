package org.sebas.generics.tarea;

import org.sebas.generics.tarea.entity.Fruta;
import org.sebas.generics.tarea.entity.Lacteo;
import org.sebas.generics.tarea.entity.Limpieza;
import org.sebas.generics.tarea.entity.NoPerecible;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public class EjemploProductos {
    public static void main(String[] args) {

        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Maracuya", 34.000, 125, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Fresa", 25.000, 83.0, "Naranja"));
        bolsaFrutas.addProducto(new Fruta("Manzan", 12.000, 200, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Banano", 26.450, 350, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Lulo", 12.345, 87.0, "Blanco"));

        BolsaSupermercado<Lacteo> bolsaLacteo = new BolsaSupermercado<>();
        bolsaLacteo.addProducto(new Lacteo("Leche", 10.000, 2, 125));
        bolsaLacteo.addProducto(new Lacteo("Manteca", 12.000, 1, 250));
        bolsaLacteo.addProducto(new Lacteo("Helado", 14.000, 3, 86));
        bolsaLacteo.addProducto(new Lacteo("Yogur", 16.000, 6, 225));
        bolsaLacteo.addProducto(new Lacteo("Queso", 18.000, 5, 500));

        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Escoba", 34.000, "Madera", 0));
        bolsaLimpieza.addProducto(new Limpieza("Trapero", 36.000, "Madera", 0));
        bolsaLimpieza.addProducto(new Limpieza("Detergente", 38.000, "Liquidos", 2));
        bolsaLimpieza.addProducto(new Limpieza("Guantes", 40.000, "Plastico", 0));
        bolsaLimpieza.addProducto(new Limpieza("Jabon de Manos", 42.000, "Liquidos", 3));

        BolsaSupermercado<NoPerecible> bolsaDeNoPerecible = new BolsaSupermercado<>();
        bolsaDeNoPerecible.addProducto(new NoPerecible("Atun", 45.000, 100, 125));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Legumbres", 47.000, 50, 80));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Fideos", 51.000, 125, 340));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Harina", 65.000, 1000, 400));
        bolsaDeNoPerecible.addProducto(new NoPerecible("Miel", 99.000, 1, 250));

        System.out.println("\n**FRUTAS**");
        imprimirProductos(bolsaFrutas);

        System.out.println("\n**LACTEOS**");
        imprimirProductos(bolsaLacteo);

        System.out.println("\n**LIMPIEZA**");
        imprimirProductos(bolsaLimpieza);

        System.out.println("\n**NO PERECIBLE**");
        imprimirProductos(bolsaDeNoPerecible);

    }

    public static <T> void imprimirProductos(BolsaSupermercado<T> bolsaProductos) {
        for (Object o : bolsaProductos.getProductos()) {
            if (o instanceof Fruta) {
                Fruta f = (Fruta) o;
                System.out.println("Nombre= " + f.getNombre() + ", Precio= " + f.getPrecio()
                        + ", Peso= " + f.getPeso() + ", Color= " + f.getColor());
            }
            if (o instanceof Lacteo) {
                Lacteo f = (Lacteo) o;
                System.out.println("Nombre= " + f.getNombre() + ", Precio= " + f.getPrecio()
                        + ", Cantidad= " + f.getCantidad() + ", Proteinas= " + f.getProteinas());
            }
            if (o instanceof Limpieza) {
                Limpieza f = (Limpieza) o;
                System.out.println("Nombre= " + f.getNombre() + ", Precio= " + f.getPrecio()
                        + ", Componentes= " + f.getComponentes() + ", Litros= " + f.getLitros());
            }
            if (o instanceof NoPerecible) {
                NoPerecible f = (NoPerecible) o;
                System.out.println("Nombre= " + f.getNombre() + ", Precio= " + f.getPrecio()
                        + ", Contenido= " + f.getContenido() + ", Calorias= " + f.getCalorias());
            }
        }
    }
}
