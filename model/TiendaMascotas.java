package model;

import java.util.ArrayList;

public class TiendaMascotas {
	
	private ArrayList <Due�o> listaDue�os = new ArrayList <>();
	private ArrayList <Mascota> listaMascotas = new ArrayList <>();
	
	private String nombre;
	
	// getters y setters
	public ArrayList<Due�o> getListaDue�os() {
		return listaDue�os;
	}
	public void setListaDue�os(ArrayList<Due�o> listaDue�os) {
		this.listaDue�os = listaDue�os;
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
	public TiendaMascotas(ArrayList<Due�o> listaDue�os, ArrayList<Mascota> listaMascotas,
			 String nombre) {
		super();
		this.listaDue�os = listaDue�os;
		this.listaMascotas = listaMascotas;
		this.nombre = nombre;
	}
	
	
	
	
	
	
}