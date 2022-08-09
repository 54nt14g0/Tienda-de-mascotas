package model;

public class Mascota extends Animal{
	// atributos
	
		private String nombre;
		private String dueño;
		private double precio;
		private String codigo;
		
		// constructor
		
		public Mascota(int edad, String especie, String color, String tamanio, String nombre, String dueño, double precio, String codigo) {
			super(edad, especie, color, tamanio);
			
			this.nombre = nombre;
			this.dueño = dueño;
			this.precio = precio;
			this.codigo = codigo;
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

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}
		
		
}
