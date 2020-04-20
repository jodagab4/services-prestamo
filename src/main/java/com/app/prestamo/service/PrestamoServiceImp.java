package com.app.prestamo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.prestamo.model.entity.Prestamo;
import com.app.prestamo.repository.PrestamoRepository;

@Service
public class PrestamoServiceImp implements IPrestamoService {

	@Autowired
	private PrestamoRepository prestamoDao;

	@Transactional
	public Prestamo save(Prestamo prestamo) {
		return prestamoDao.save(prestamo);
	}
	

	public List<Prestamo> findAll() {
		return (List<Prestamo>) prestamoDao.findAll();
	}


	@Transactional(readOnly = true)
	public Prestamo findById(Integer id) {
		return prestamoDao.findById(id).orElse(null);
	}
	
	@Transactional(readOnly = true)
	public Prestamo findByCuota(Integer cuota) {
		return prestamoDao.findByCouta(cuota);
	}

	
}
