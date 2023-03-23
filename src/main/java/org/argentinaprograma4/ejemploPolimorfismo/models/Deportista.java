package org.argentinaprograma4.ejemploPolimorfismo.models;

public class Deportista extends Persona{

	public Deportista(String nombre) {
		super(nombre);
	}

	@Override
	public int correr() {
		return 7;
	}	
	
}
