package org.sebas.generics.classgenerics;

/**
 * @author jhonc
 * @version 1.0
 * @since 12/04/2022
 */
public enum TipoAnimal {

    CABALLO("Caballo");

    private final String tipoAnimal;

    TipoAnimal(String tipoAnimal){
        this.tipoAnimal = tipoAnimal;
    }

    public String getTipoAnimal(){
        return this.tipoAnimal;
    }

}
