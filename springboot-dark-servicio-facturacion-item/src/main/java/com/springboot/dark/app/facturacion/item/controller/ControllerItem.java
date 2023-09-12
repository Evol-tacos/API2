package com.springboot.dark.app.facturacion.item.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dark.app.facturacion.item.modelo.Items;
import com.springboot.dark.app.facturacion.item.modelo.servicio.ServicioItems;

@RestController
public class ControllerItem {

	@Autowired
	@Qualifier("serviceFeign")
	private ServicioItems servicioItems;
	
	@GetMapping("/listar")
	public List<Items> listar(){
		return servicioItems.findAll();
	}
	
	@GetMapping("/ver/{id}/cantidad/{cantidad}")
	public Items detalle(@PathVariable Long id, @PathVariable Date fecha) {
		return servicioItems.findById(id, fecha);
	}
}
