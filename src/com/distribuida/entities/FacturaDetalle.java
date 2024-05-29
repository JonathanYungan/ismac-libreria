package com.distribuida.entities;

import org.springframework.stereotype.Component;

@Component
public class FacturaDetalle {
 
	
	private int idFactura_detalle;
	private int cantidad;
	private double subtotal;
	int idFactura;
	int idLibro;
	
	
	public FacturaDetalle() {}
 
 
	public FacturaDetalle(int idFactura_detalle, int cantidad, double subtotal, int idFactura, int idLibro) {
		super();
		this.idFactura_detalle = idFactura_detalle;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.idFactura = idFactura;
		this.idLibro = idLibro;
	}
 
 
	public int getIdFactura_detalle() {
		return idFactura_detalle;
	}
 
 
	public void setIdFactura_detalle(int idFactura_detalle) {
		this.idFactura_detalle = idFactura_detalle;
	}
 
 
	public int getCantidad() {
		return cantidad;
	}
 
 
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
 
 
	public double getSubtotal() {
		return subtotal;
	}
 
 
	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}
 
 
	public int getIdFactura() {
		return idFactura;
	}
 
 
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}
 
 
	public int getIdLibro() {
		return idLibro;
	}
 
 
	public void setIdLibro(int idLibro) {
		this.idLibro = idLibro;
	}
 
 
	@Override
	public String toString() {
		return "FacturaDetalle [idFactura_detalle=" + idFactura_detalle + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", idFactura=" + idFactura + ", idLibro=" + idLibro + "]";
	}
 
 
	
	
	
}