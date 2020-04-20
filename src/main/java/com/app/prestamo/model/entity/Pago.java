package com.app.prestamo.model.entity;

import java.io.Serializable;


public class Pago implements Serializable{

	private static final long serialVersionUID = -8417221699476876191L;

	private Integer id;
	private int nroPrestamo;
	private int cuota;
	private double importeCuota;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public int getNroPrestamo() {
		return nroPrestamo;
	}
	public void setNroPrestamo(int nroPrestamo) {
		this.nroPrestamo = nroPrestamo;
	}
	public int getCuota() {
		return cuota;
	}
	public void setCuota(int cuota) {
		this.cuota = cuota;
	}
	public double getImporteCuota() {
		return importeCuota;
	}
	public void setImporteCuota(double importeCuota) {
		this.importeCuota = importeCuota;
	}		
}
