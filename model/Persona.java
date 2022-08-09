package model;

public class Persona {
	
	// atributos
	
	private String nombre;
	private int edad;
	private String codigo;
	
	// getters y setters
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	// constructor
	
	public Persona(String nombre, int edad, String codigo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.codigo = codigo;
	}
	
	
	
	
	
}
