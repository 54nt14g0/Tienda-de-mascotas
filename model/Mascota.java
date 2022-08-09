package model;

public class Mascota extends Animal{
	// atributos
	
		private String nombre;
		private String dueño;
		private double precio;
		
		// constructor
		
		public Mascota(int edad, String especie, String color, String tamanio, String nombre, String dueño, double precio) {
			super(edad, especie, color, tamanio);
			
			this.nombre = nombre;
			this.dueño = dueño;
			this.precio = precio;
		}
		
		// getters y setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getDueño() {
			return dueño;
		}

		public void setDueño(String dueño) {
			this.dueño = dueño;
		}

		public double getPrecio() {
			return precio;
		}

		public void setPrecio(double precio) {
			this.precio = precio;
		}
		
}
