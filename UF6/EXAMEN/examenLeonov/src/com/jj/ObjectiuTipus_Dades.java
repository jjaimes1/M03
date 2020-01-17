/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;


/**
 *
 * @author gmartinez
 */
public class ObjectiuTipus_Dades implements Comparable<ObjectiuTipus_Dades> , Comparator<ObjectiuTipus_Dades> {
    int id;                     
    String nom;
    LocalDate dataCreacio;

    
    public ObjectiuTipus_Dades(int id, String nom, LocalDate dataCreacio) {
        this.id = id;
        this.nom = nom;
        this.dataCreacio = dataCreacio;
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public LocalDate getDataCreacio() {
        return dataCreacio;
    }
    
    

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }





    @Override
    public int compareTo(ObjectiuTipus_Dades objectiuTipus_dades) {
        return this.getNom().compareTo(objectiuTipus_dades.getNom());
    }


    @Override
    public int compare(ObjectiuTipus_Dades objectiuTipus_dades, ObjectiuTipus_Dades t1) {
        return objectiuTipus_dades.compare(objectiuTipus_dades, t1);
    }
}
