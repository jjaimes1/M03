/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leonov_2019_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/**
 *
 * @author gines
 */
public class TipusMissatges_Dades {
    int id;                     //Clau primaria. Es crea automàticament pel sistema i és intocable.
    String nom;                 //EMAIL, CHAT, FTP,...
    boolean actiu;              //TRUE si és un tipus actiu (que es pot fer servir)
    LocalDateTime dataCreacio;
    LocalDateTime dataAnulacio;      //Quan actiu passi a valdre FALSE.

    
    
    public TipusMissatges_Dades(int id, String nom, boolean actiu, LocalDateTime dataCreacio, LocalDateTime dataAnulacio) {
        this.id = id;
        this.nom = nom;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        this.dataAnulacio = dataAnulacio;
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public boolean isActiu() {
        return actiu;
    }

    public LocalDateTime getDataCreacio() {
        return dataCreacio;
    }

    public LocalDateTime getDataAnulacio() {
        return dataAnulacio;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    public void setDataCreacio(LocalDateTime dataCreacio) {
        this.dataCreacio = dataCreacio;
    }

    public void setDataAnulacio(LocalDateTime dataAnulacio) {
        this.dataAnulacio = dataAnulacio;
    }

    
    @Override
    public String toString() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
    	
    	String textARetornar;
    	
    	textARetornar = "TipusMissatges_Dades{id=" + id + ", nom=" + nom + ", actiu=" + actiu;
    	
    	if (dataCreacio != null) {
    		textARetornar = textARetornar + ", dataCreacio="  + dataCreacio.format(formatter);
    	} else {
    		textARetornar = textARetornar + ", dataCreacio=NO EXISTEIX";
    	}
    	
    	if (dataAnulacio != null) {
    		textARetornar = textARetornar + ", dataAnulacio=" + dataAnulacio.format(formatter);
    	} else {
    		textARetornar = textARetornar + ", dataCreacio=NO EXISTEIX";
    	}
    	    	
        return textARetornar;
    }
    
    
    
}
