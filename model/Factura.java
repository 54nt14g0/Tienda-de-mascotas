package model;


public class Factura {
	
	
	private String codigo;
	private String fecha;
	private double total;
	
	
	private Due�o due�o;
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
	public Due�o getDue�o() {
		return due�o;
	}
	public void setDue�o(Due�o due�o) {
		this.due�o = due�o;
	}
	public DetalleFactura getDetalleFactura() {
		return detalleFactura;
	}
	public void setDetalleFactura(DetalleFactura detalleFactura) {
		this.detalleFactura = detalleFactura;
	}
	// CONSTRUCTOR
	public Factura(String codigo, String fecha, double total, Due�o due�o, DetalleFactura detalleFactura) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.total = total;
		this.due�o = due�o;
		this.detalleFactura = detalleFactura;
	}
	
	
	
}
