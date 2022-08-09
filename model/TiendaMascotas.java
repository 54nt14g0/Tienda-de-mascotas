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
	public TiendaMascotas(
			 String nombre) {
		super();
		
		this.nombre = nombre;
	}
	
	public Mascota obtenerMascota (String codigo) {
		Mascota mascotaEncontrada =null;
		for (int i = 0; i < listaMascotas.size(); i++) {
			if (listaMascotas.get(i).getCodigo().equals(codigo)){
				 mascotaEncontrada = listaMascotas.get(i);
			}
		}
		return  mascotaEncontrada;
	}
	
	public void eliminarMascota (String codigo){
		Mascota mascotaEncontrada =null;
		for (int i = 0; i < listaMascotas.size(); i++) {
			if (listaMascotas.get(i).getCodigo().equals(codigo)){
				 mascotaEncontrada = null;
			}
		}
		
	}
	
	
	
	
}
