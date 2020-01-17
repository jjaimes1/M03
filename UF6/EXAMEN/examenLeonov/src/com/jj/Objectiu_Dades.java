/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jj;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author gmartinez
 */
public class Objectiu_Dades {
    int id;                     
    String nom;
    int[] coordenades;
    ObjectiuTipus_Dades tipus;
    boolean actiu;              
    LocalDate dataCreacio;
    LocalDate dataAnulacio;      
    LocalDate dataModificacio;

    
    public Objectiu_Dades(int id, String nom, int[] coordenades, ObjectiuTipus_Dades tipus, boolean actiu, LocalDate dataCreacio, LocalDate dataAnulacio, LocalDate dataModificacio) {
        this.id = id;
        this.nom = nom;
        this.coordenades = coordenades;
        this.tipus = tipus;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        this.dataAnulacio = dataAnulacio;
        this.dataModificacio = dataModificacio;
    }


    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int[] getCoordenades() {
        return coordenades;
    }

    public boolean isActiu() {
        return actiu;
    }

    public LocalDate getDataCreacio() {
        return dataCreacio;
    }

    public LocalDate getDataAnulacio() {
        return dataAnulacio;
    }
    
    public LocalDate getDataModificacio() {
        return dataModificacio;
    }

    public ObjectiuTipus_Dades getTipus() {
        return tipus;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCoordenades(int[] coordenades) {
        this.coordenades = coordenades;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    public void setDataCreacio(LocalDate dataCreacio) {
        this.dataCreacio = dataCreacio;
    }

    public void setDataAnulacio(LocalDate dataAnulacio) {
        this.dataAnulacio = dataAnulacio;
    }

    public void setDataModificacio(LocalDate dataModificacio) {
        this.dataModificacio = dataModificacio;
    }






}
