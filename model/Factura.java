package model;


public class Factura {
	
	
	private String codigo;
	private String fecha;
	private double total;
	
	
	private Dueño dueño;
	private DetalleFactura detalleFactura;
	
	// getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Dueño getDueño() {
		return dueño;
	}
	public void setDueño(Dueño dueño) {
		this.dueño = dueño;
	}
	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}
	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	// CONSTRUCTOR
	public Factura(String codigo, String fecha, double total, Dueño dueño, DetalleFactura detalleFactura) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.total = total;
		this.dueño = dueño;
		this.detalleFactura = detalleFactura;
	}
	
	
	
}
