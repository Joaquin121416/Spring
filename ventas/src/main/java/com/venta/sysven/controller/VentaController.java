package com.venta.sysven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.venta.sysven.services.VentaService;

@Controller
public class VentaController {

	@Autowired
	private VentaService ventaService;
	
	@RequestMapping("/")
	public String listarModelAndView(Model model) {		
		model.addAttribute("lista", ventaService.listarProductos());		
		return "venta";
	}
}
