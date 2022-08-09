package model;

import java.util.ArrayList;

public class Dueño extends Persona{

	
	private ArrayList <Mascota> listaMascotas = new ArrayList <>(); 
	// constructor
	
	public Dueño(String nombre, int edad, String codigo) {
		super(nombre, edad, codigo);
	}
	// getters y setters
	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
	
}
