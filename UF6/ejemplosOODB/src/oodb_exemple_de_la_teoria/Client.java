/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oodb_exemple_de_la_teoria;


import java.util.*;
/**
 *
 * @author gmartinez
 */
public class Client {
    private String nom;
    private String aPostal;
    private String aElectronica;
    private String telefon;
    private List<Encarrec> liComandes = new LinkedList<Encarrec>();
    
    
    public Client(String n, String ap, String ae, String t) {
        nom = n;
        aPostal = ap;
        aElectronica = ae;
        telefon = t;
    }
    
    public String getNom() {
        return nom;
    }
    
    public String getAPostal() {
        return aPostal;
    }
    
    public String getAElectronica() {
        return aElectronica;
    }
    
    public void setAElectronica(String ae) {
        aElectronica = ae;
    }
    
    public String getTelefon() {
        return telefon;
    }
    
    public int getNreComandes() {
        return liComandes.size();
    }
    
    public void addComanda(Encarrec e) {
        liComandes.add(e);
    }
    
    public List<Encarrec> getComandes() {
        return liComandes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) &&
                Objects.equals(aElectronica, client.aElectronica) &&
                Objects.equals(telefon, client.telefon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, aElectronica, telefon);
    }

    @Override
    public String toString() {
        String res = nom + " : " + aPostal + " : (" + aElectronica + ", " + telefon + ")\n";
        Iterator<Encarrec> it = liComandes.iterator();
        while (it.hasNext()) {
            Encarrec e = it.next();
            res += e.toString() + "\n";
        }
        return res;
    }
}
