package com.springboot.dark.app.facturacion.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.springboot.dark.app.facturacion.item.modelo.Facturas;

@FeignClient(name = "servicio-facturas-items")
public interface FacturasRest {

	@GetMapping("/listar")
	public List<Facturas> listar();
	
	@GetMapping("/ver/{id}")
	public Facturas detalle(@PathVariable Long id);
}
