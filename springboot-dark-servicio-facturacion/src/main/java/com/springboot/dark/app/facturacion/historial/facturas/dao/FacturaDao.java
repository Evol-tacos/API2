package com.springboot.dark.app.facturacion.historial.facturas.dao;

import org.springframework.data.repository.CrudRepository;

import com.springboot.dark.app.facturacion.historial.facturas.Facturas;

public interface FacturaDao extends CrudRepository<Facturas, Long> {

}
