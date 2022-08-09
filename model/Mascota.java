package model;

public class Mascota extends Animal{
	// atributos
	
		private String nombre;
		private String due�o;
		private double precio;
		private String codigo;
		
		// constructor
		
		public Mascota(int edad, String especie, String color, String tamanio, String nombre, String due�o, double precio, String codigo) {
			super(edad, especie, color, tamanio);
			
			this.nombre = nombre;
			this.due�o = due�o;
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

		public String getDue�o() {
			return due�o;
		}

		public void setDue�o(String due�o) {
			this.due�o = due�o;
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
