package com.springboot.dark.app.facturacion.item.modelo;

import java.util.Date;

public class Items {

	private Facturas factura;
	private Date fecha;
	private Integer id;
	
	public Items(Facturas factura, Date fecha) {
		this.factura = factura;
		this.fecha = fecha;
	}
	public Items(Facturas factura, Integer id) {
		this.factura = factura;
		this.id = id;
	}
		public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Facturas getFactura() {
		return factura;
	}

	public void setFactura(Facturas factura) {
		this.factura = factura;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
