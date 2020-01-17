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
public class Missatge_Dades {
    int id;                     //Clau primaria. Es crea automàticament pel sistema i és intocable.
    int tipus;                  //És el ID de la classe Tipus_Missatges.
    int origen;                 //És el ID de la classe Usuaris.
    int desti;                  //És el ID de la classe Usuaris.
    boolean censurat;           //TRUE si volem que el destinatari no sàpigui que existeix
    LocalDateTime dataEnviament;     //Quan es va generar i enviar el missatge per l'origen.
    LocalDateTime dataRebut;         //Quan es va rebre el missatge (o llegir) pel destinatari.
    String dada;                //El contingut de l'email / chat o la dir+nom del fitxer pel ftp. 

    
    
    public Missatge_Dades(int id, int tipus, int origen, int desti, boolean censurat, LocalDateTime dataEnviament, LocalDateTime dataRebut, String dada) {
        this.id = id;
        this.tipus = tipus;
        this.origen = origen;
        this.desti = desti;
        this.censurat = censurat;
        this.dataEnviament = dataEnviament;
        this.dataRebut = dataRebut;
        this.dada = dada;
    }

    
    public int getId() {
        return id;
    }

    public int getTipus() {
        return tipus;
    }

    public int getOrigen() {
        return origen;
    }

    public int getDesti() {
        return desti;
    }

    public boolean isCensurat() {
        return censurat;
    }

    public LocalDateTime getDataEnviament() {
        return dataEnviament;
    }

    public LocalDateTime getDataRebut() {
        return dataRebut;
    }

    public String getDada() {
        return dada;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setTipus(int tipus) {
        this.tipus = tipus;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public void setDesti(int desti) {
        this.desti = desti;
    }

    public void setCensurat(boolean censurat) {
        this.censurat = censurat;
    }

    public void setDataEnviament(LocalDateTime dataEnviament) {
        this.dataEnviament = dataEnviament;
    }

    public void setDataRebut(LocalDateTime dataRebut) {
        this.dataRebut = dataRebut;
    }

    public void setDada(String dada) {
        this.dada = dada;
    }

    
    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
        
        return "Missatge_Dades{" + "id=" + id + 
                ", tipus=" + tipus + 
                ", origen=" + origen + 
                ", desti=" + desti + 
                ", censurat=" + censurat + 
                ", dataEnviament=" + dataEnviament.format(formatter) + 
                ", dataRebut=" + dataRebut.format(formatter) + 
                ", dada=" + dada + '}';
    }
    
    
    
    
    
}
