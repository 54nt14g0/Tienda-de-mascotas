package model;

import java.util.ArrayList;

public class Dueño extends Persona{

	
	private ArrayList <Mascota> listaMascotas = new ArrayList <>(); 
	private double presupuesto;
	// constructor
	
	public Dueño(String nombre, int edad, String codigo,double presupuesto) {
		super(nombre, edad, codigo);
		this.presupuesto = presupuesto;
	}
	// getters y setters
	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}

	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
	public double getPresupuesto() {
		return presupuesto;
	}
	public void setPresupuesto(double presupuesto) {
		this.presupuesto = presupuesto;
	}
	
	
}
