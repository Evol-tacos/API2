package com.springboot.dark.app.facturacion.item.clientes;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.springboot.dark.app.facturacion.item.modelo.Items;
import com.springboot.dark.app.facturacion.item.modelo.servicio.ServicioItems;

@Service("serviceFeign")
@Primary
public class ItemServiceFeign implements ServicioItems {

	@Autowired
	private FacturasRest facturasFeign;

	@Override
	public List<Items> findAll() {
		return facturasFeign.listar().stream().map(p -> new Items(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Items findById(Long id, Date fecha) {
		return new Items(facturasFeign.detalle(id), fecha);
	}
}
