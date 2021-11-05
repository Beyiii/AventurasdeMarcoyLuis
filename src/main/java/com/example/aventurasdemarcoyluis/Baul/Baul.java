package com.example.aventurasdemarcoyluis.Baul;

import java.util.ArrayList;
import java.util.List;
import com.example.aventurasdemarcoyluis.Items.*;

/**
 * Clase representa el baul donde estaran guardados los items.
 * Es ocupado por los personajes principales
 */
public class Baul {
    private final List<Items> baul;

    /**
     * Crea una lista donde estarán los items que se pueden utilizar.
     */
    public Baul(){
        this.baul = new ArrayList<Items>();
    }

    /**
     * Agrega un item al baul.
     * @param item red mushroom, honey syrup u otro.
     */
    public void addItem(Items item){
        this.baul.add(item);
    }

    /**
     * Retira un item del baul.
     * @param item red mushroom, honey syrup u otro.
     */
    public void removeItem(Items item){
        this.baul.remove(item);
    }

    /**
     * Remueve el item (si es que está) y retorna true o false.
     * @param item red mushroom, honey syrup u otro.
     * @return true si el item se encuentra en la lista, false si el no.
     */
    public boolean useItem(Items item){
        boolean t = this.baul.contains(item);
        this.removeItem(item);
        return t;
    }

    /**
     * Borra todos los items de la lista.
     */
    public void clearBaul(){
        this.baul.clear();
    }
}