/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2019_2020_DAM;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


/**
 *
 * @author gmartinez
 */
public class ObjectiuTipus_Dades {
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

    
    
    
    
}
