/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Leonov_2019_2020;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author gines
 */
public class Usuaris_Dades {
    int id;                     //Clau primaria. Es crea automàticament pel sistema i és intocable.
    String nom;
    String cognoms;
    String direccio;
    boolean actiu;              //TRUE si és un usuari que té permís per accedir al server.
    LocalDateTime dataCreacio;
    LocalDateTime dataAnulacio;      //Quan actiu passi a valdre FALSE.
    LocalDateTime dataUltimAcces;
    ArrayList<Integer> contactes;   //Conté una llista de a tots els usuaris (ID's) als quals els ha enviat alguna cosa.
    
    
    
    public Usuaris_Dades(int id, String nom, String cognoms, String direccio, boolean actiu, LocalDateTime dataCreacio, LocalDateTime dataAnulacio, LocalDateTime dataUltimAcces, ArrayList<Integer> contactes) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.direccio = direccio;
        this.actiu = actiu;
        this.dataCreacio = dataCreacio;
        this.dataAnulacio = dataAnulacio;
        this.dataUltimAcces = dataUltimAcces;
        this.contactes = contactes;
    }

    
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getDireccio() {
        return direccio;
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

    public LocalDateTime getDataUltimAcces() {
        return dataUltimAcces;
    }

    public ArrayList<Integer> getContactes() {
        return contactes;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
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

    public void setDataUltimAcces(LocalDateTime dataUltimAcces) {
        this.dataUltimAcces = dataUltimAcces;
    }

    public void setContactes(ArrayList<Integer> contactes) {
        this.contactes = contactes;
    }

    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        return  "\n       {id=" + id + 
                "\n        nom=" + nom + 
                "\n        cognoms=" + cognoms + 
                "\n        direccio=" + direccio + 
                "\n        actiu=" + actiu + 
                "\n        dataCreacio=" + dataCreacio.format(formatter) + 
                "\n        dataAnulacio=" + dataAnulacio.format(formatter) + 
                "\n        dataUltimAcces=" + dataUltimAcces.format(formatter) +
                "\n        contactes=" + contactes + '}';
    }
    
    
}
