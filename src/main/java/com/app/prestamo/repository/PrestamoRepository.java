package com.app.prestamo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.prestamo.model.entity.Prestamo;

@Repository
public interface PrestamoRepository extends CrudRepository<Prestamo, Integer>{

	@Query("select o from Prestamo o where o.cuota = ?1")
	public Prestamo findByCouta(Integer cuota);
}
