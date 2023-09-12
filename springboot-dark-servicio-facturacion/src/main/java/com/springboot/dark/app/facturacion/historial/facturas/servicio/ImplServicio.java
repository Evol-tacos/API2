package com.springboot.dark.app.facturacion.historial.facturas.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dark.app.facturacion.historial.facturas.Facturas;
import com.springboot.dark.app.facturacion.historial.facturas.dao.FacturaDao;


@Service
public class ImplServicio implements FacturaServicio {

	@Autowired
	private FacturaDao facturasDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Facturas> findAll() {
		return (List<Facturas>) facturasDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Facturas findById(Long id) {
		// TODO Auto-generated method stub
		return facturasDao.findById(id).orElse(null);
	}

	
}
