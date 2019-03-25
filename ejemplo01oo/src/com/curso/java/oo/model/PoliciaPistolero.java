package com.curso.java.oo.model;

import java.io.Serializable;

public class PoliciaPistolero extends Policia implements PuedeDisparar, Serializable{
	private String pistolon ;

	public String getPistolon() {
		return pistolon;
	}

	public void setPistolon(String pistolon) {
		this.pistolon = pistolon;
	}

	@Override
	public void dispararSinJuicio(String objetivo) {
		System.out.println("Disparando con " + pistolon + " a " + objetivo);
		
	}

}
