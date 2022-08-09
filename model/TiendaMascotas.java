package model;

import java.util.ArrayList;

public class TiendaMascotas {
	
	private ArrayList <Dueño> listaDueños = new ArrayList <>();
	private ArrayList <Mascota> listaMascotas = new ArrayList <>();
	
	private String nombre;
	
	// getters y setters
	public ArrayList<Dueño> getListaDueños() {
		return listaDueños;
	}
	public void setListaDueños(ArrayList<Dueño> listaDueños) {
		this.listaDueños = listaDueños;
	}
	public ArrayList<Mascota> getListaMascotas() {
		return listaMascotas;
	}
	public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
		this.listaMascotas = listaMascotas;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// constructor
	public TiendaMascotas(ArrayList<Dueño> listaDueños, ArrayList<Mascota> listaMascotas,
			 String nombre) {
		super();
		this.listaDueños = listaDueños;
		this.listaMascotas = listaMascotas;
		this.nombre = nombre;
	}
	
	
	
	
	
	
}
