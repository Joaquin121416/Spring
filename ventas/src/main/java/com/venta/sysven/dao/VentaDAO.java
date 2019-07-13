package com.venta.sysven.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.venta.sysven.bean.Producto;
import com.venta.sysven.fn.FnListarProductos;

@Repository
public class VentaDAO {

	@Autowired

	FnListarProductos funcion;

	public List<String> listar() {
		List<String> listaTablas = new ArrayList<>();
		List<Producto> lista = funcion.execute();
		for (Producto producto : lista) {

			listaTablas.add(producto.getNomPro());
		}
		return listaTablas;

	}

}
