package com.springboot.dark.app.facturacion.item.modelo.servicio;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.springboot.dark.app.facturacion.item.modelo.Facturas;
import com.springboot.dark.app.facturacion.item.modelo.Items;

@Service("serviceRestTemplate")
public class ServImp implements ServicioItems {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Items> findAll() {
		List<Facturas> facturas = Arrays.asList(clienteRest.getForObject("https://localhost:8001/listar", Facturas[].class));
		return facturas.stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Items findById(Long id, Date fecha) { 
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Facturas factura = clienteRest.getForObject("http://localhost:8001/ver/{id}", Facturas.class, pathVariables);
		return new Items(factura, fecha);
	}

}
