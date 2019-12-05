/*
 * Copyright (c) 2019.
 * Made by JJ Company
 */

package com.jj;

public class Contacte
{

    public String coreu;
    public int telefon;
    public String direccio;

    public Contacte(String coreu, int telefon, String direccio) {
        this.coreu = coreu;
        this.telefon = telefon;
        this.direccio = direccio;
    }

    @Override
    public String toString() {
        return "Dades de Contacte:" +
                "coreu='" + coreu + '\'' +
                ", telefon=" + telefon +
                ", direccio='" + direccio + '\n';
    }

    public String getCoreu() {
        return coreu;
    }

    public void setCoreu(String coreu) {
        this.coreu = coreu;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }
}
