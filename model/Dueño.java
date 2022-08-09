package model;

import java.util.ArrayList;

public class Dueño extends Persona{

	private TiendaMascotas tiendaMascotas;
	private ArrayList <Mascota> listaMascotas = new ArrayList <>(); 
	private double presupuesto;
	// constructor
	
	public Dueño(String nombre, int edad, String codigo,double presupuesto, TiendaMascotas tiendaMascotas) {
		super(nombre, edad, codigo);
		this.presupuesto = presupuesto;
		this.tiendaMascotas = tiendaMascotas;
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
	
	
	public TiendaMascotas getTiendaMascotas() {
		return tiendaMascotas;
	}
	public void setTiendaMascotas(TiendaMascotas tiendaMascotas) {
		this.tiendaMascotas = tiendaMascotas;
	}
	public void comprarMascota (String codigo) {
		
		Mascota  mascotaEncontrada = tiendaMascotas.obtenerMascota(codigo);
		if (validarAlcanzaDinero (mascotaEncontrada)){
			listaMascotas.add(mascotaEncontrada);
			this.presupuesto = presupuesto - mascotaEncontrada.getPrecio();
		}
	}
	private boolean validarAlcanzaDinero(Mascota mascotaEncontrada) {
		boolean alcanza = false;
		if (mascotaEncontrada.getPrecio()<presupuesto){
			alcanza = true;
		}
		return alcanza;
	}
	
}
