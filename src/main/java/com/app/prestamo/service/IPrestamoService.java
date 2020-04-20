package com.app.prestamo.service;

import java.util.List;

import com.app.prestamo.model.entity.Prestamo;

public interface IPrestamoService {

	public Prestamo save (Prestamo prestamo );
	public List<Prestamo> findAll();
	public Prestamo findById(Integer id);
	public Prestamo findByCuota(Integer cuota);
}

