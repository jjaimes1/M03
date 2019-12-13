package com.lau.classe1;

public class Estudiant extends Persona{
	String curs;
	
	public Estudiant(int edat, String nom, String curs) {
		super(edat, nom);
		// TODO Auto-generated constructor stub
		this.curs = curs;
	}

	@Override
	public String wave() {
		// TODO Auto-generated method stub
		return super.wave()+ " i curso "+this.curs;
	}




}
