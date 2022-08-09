package model;


public class DetalleFactura {
	

	private int cantidad;
	private double total;

	private Mascota mascota;

	// getters y setters
	
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Mascota getMascotaComprada() {
		return mascota;
	}

	public void setMascotaComprada(Mascota mascotaComprada) {
		this.mascota = mascotaComprada;
	}
	// constructor
	public DetalleFactura(int cantidad, double total, Mascota mascotaComprada) {
		super();
		this.cantidad = cantidad;
		this.total = total;
		this.mascota = mascotaComprada;
	}

	
	
	
	
	
}
