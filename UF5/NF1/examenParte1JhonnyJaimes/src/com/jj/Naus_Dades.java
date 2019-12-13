package com.jj;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class Naus_Dades
{
    public String nom;
    public String tipus;
    public String model;
    public LocalDateTime dataConstruccio;
    public String descripcio;


    public Naus_Dades(String nom, String tipus, String model, LocalDateTime dataConstruccio, String descripcio) {
        this.nom = nom;
        this.tipus = tipus;
        this.model = model;
        this.dataConstruccio = dataConstruccio;
        this.descripcio = descripcio;
    }

    @Override
    public String toString() {
        return "Naus_Dades " +
                "nom='" + nom + '\'' +
                ", tipus='" + tipus + '\'' +
                ", model='" + model + '\'' +
                ", dataConstruccio=" + dataConstruccio +
                ", descripcio='" + descripcio + '\'' + "\n";
    }

    public String getNom() {
        return nom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Naus_Dades that = (Naus_Dades) o;
        return Objects.equals(nom, that.nom) &&
                Objects.equals(tipus, that.tipus) &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, tipus, model);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDateTime getDataConstruccio() {
        return dataConstruccio;
    }

    public void setDataConstruccio(LocalDateTime dataConstruccio) {
        this.dataConstruccio = dataConstruccio;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }


}


