package org.argentinaprograma4.ejemploPolimorfismo.models;

public class Ingeniero extends Persona{

	public Ingeniero(String nombre) {
		super(nombre);
	}

	@Override
	public int correr() {
		// TODO Auto-generated method stub
		return 3;
	}
	
}
