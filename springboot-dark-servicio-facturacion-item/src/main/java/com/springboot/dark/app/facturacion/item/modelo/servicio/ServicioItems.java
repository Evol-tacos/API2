package com.springboot.dark.app.facturacion.item.modelo.servicio;

import java.util.Date;
import java.util.List;

import com.springboot.dark.app.facturacion.item.modelo.Items;

public interface ServicioItems {

	public List<Items> findAll();
	public Items findById(Long id, Date fecha);
}
