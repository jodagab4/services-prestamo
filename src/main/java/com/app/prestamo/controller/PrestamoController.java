package com.app.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.app.prestamo.model.entity.Prestamo;
import com.app.prestamo.service.IPrestamoService;

@RestController
public class PrestamoController {

	@Autowired
	private IPrestamoService service;
	
	@GetMapping("/prestamo/listarPrestamos")
	public List<Prestamo> listar(){
		return (List<Prestamo>) service.findAll();
	}
	
	@GetMapping("/prestamo/verCuota/{id}")
	public Prestamo detalle(@PathVariable Integer id ){
		return (Prestamo) service.findByCuota(id);
	}
}
