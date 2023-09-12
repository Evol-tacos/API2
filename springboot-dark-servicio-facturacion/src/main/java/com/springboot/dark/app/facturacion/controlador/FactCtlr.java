package com.springboot.dark.app.facturacion.controlador;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dark.app.facturacion.historial.facturas.Facturas;
import com.springboot.dark.app.facturacion.historial.facturas.servicio.FacturaServicio;

@RestController
public class FactCtlr {
	
	@Autowired
	private Environment env;
	
	@Autowired
	private FacturaServicio facturaServicio;
	
	@GetMapping("/listar") 
	public List<Facturas>listar(){
		return facturaServicio.findAll().stream().map(facturas -> {
		facturas.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return facturas;
		}).collect(Collectors.toList());
	}
	
	@GetMapping("/ver/{id}")
	public Facturas detalle(@PathVariable Long id) {
		Facturas facturas = facturaServicio.findById(id);
		facturas.setPort(Integer.parseInt(env.getProperty("local.server.port")));
		return facturas;
	}

}
