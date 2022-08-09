package model;

public class Animal {
	
	//Atributos
	private int edad;
	private String especie;
	private String color;
	private String tamanio;
	
	// getters y  setters
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	// constructor
	
	public Animal(int edad, String especie, String color, String tamanio) {
		super();
		this.edad = edad;
		this.especie = especie;
		this.color = color;
		this.tamanio = tamanio;
	}
	
	
}

