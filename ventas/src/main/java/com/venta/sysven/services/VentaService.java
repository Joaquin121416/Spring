package com.venta.sysven.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venta.sysven.dao.VentaDAO;

@Service
public class VentaService {
	@Autowired
	private VentaDAO ventasDAO;

	public List<String> listarProductos() {
		return ventasDAO.listar();
	}

}
