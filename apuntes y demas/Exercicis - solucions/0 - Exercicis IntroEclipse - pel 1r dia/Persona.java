package com.lau.classe1;




/**
 * @author laura
 *
 */
public class Persona {
	int edat;
	String nom;
	
	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Persona [edat=" + edat + "]";
	}

	/**
	 * Constructora de persona
	 * 
	 * @param edat
	 * @param nom
	 */
	public Persona(int edat, String nom) {
		this.edat = edat;
		this.nom = nom;
	}

	/**
	 * Mostra per pantalla el nom i l'edat de la persona.
	 */
	public String wave() {
		return "Hola em dic " + nom + " i tinc " + edat + " anys!";
	}
}
