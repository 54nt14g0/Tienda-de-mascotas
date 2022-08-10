package model;

public class Mascota extends Animal{
	// atributos
	
		private String nombre;
		private Due�o due�o;
		private double precio;
		private String codigo;
		private TiendaMascotas tiendaMascotas;
		// constructor
		
		public Mascota(int edad, String especie, String color, String tamanio, String nombre, Due�o due�o, double precio, String codigo, TiendaMascotas tiendaMascotas) {
			super(edad, especie, color, tamanio);
			
			this.nombre = nombre;
			this.due�o = due�o;
			this.precio = precio;
			this.codigo = codigo;
			this.tiendaMascotas = tiendaMascotas;
		}
		
		// getters y setters
		
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public Due�o getDue�o() {
			return due�o;
		}

		public void setDue�o(Due�o due�o) {
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

		public TiendaMascotas getTiendaMascotas() {
			return tiendaMascotas;
		}

		public void setTiendaMascotas(TiendaMascotas tiendaMascotas) {
			this.tiendaMascotas = tiendaMascotas;
		}
		
		
		
}
