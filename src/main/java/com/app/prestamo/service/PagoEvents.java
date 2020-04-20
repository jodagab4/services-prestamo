package com.app.prestamo.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.prestamo.model.entity.Pago;
import com.app.prestamo.model.entity.Prestamo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class PagoEvents {

	private Logger log = LoggerFactory.getLogger(PagoEvents.class);
	
	@Autowired
	private IPrestamoService repository;
	
	@Autowired
	ObjectMapper objectMapper;
	
	public void processTransacctionEvent(ConsumerRecord<Integer, String> consumerRecord) 
			throws JsonMappingException, JsonProcessingException {
		Prestamo objPrestamo = new Prestamo();
		Pago pagoEvent = objectMapper.readValue(consumerRecord.value(), Pago.class);
		objPrestamo=repository.findByCuota(pagoEvent.getCuota());
		log.info("num cuota : {} ", objPrestamo.getCuota());
		log.info("setPagado : {} ", "True");
		objPrestamo.setPagado(true);
		repository.save(objPrestamo);
	}
	
}
