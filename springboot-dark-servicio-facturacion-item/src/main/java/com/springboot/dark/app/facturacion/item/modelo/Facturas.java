package com.springboot.dark.app.facturacion.item.modelo;

import java.util.Date;

public class Facturas {

	private long id;
	private Date fecha;
	private String descripcion;
	private double precio;
	private Integer port;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	
}
