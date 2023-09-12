package com.springboot.dark.app.facturacion.historial.facturas.servicio;

import java.util.List;

import com.springboot.dark.app.facturacion.historial.facturas.Facturas;

public interface FacturaServicio {

	public List<Facturas> findAll();
	public Facturas findById(Long id);
}
