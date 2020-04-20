package com.app.prestamo.consumer.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.app.prestamo.service.PagoEvents;
import com.fasterxml.jackson.core.JsonProcessingException;

@Component
public class PagoEventsConsumer {

	@Autowired
	private PagoEvents pagoEvents;
	private Logger log =LoggerFactory.getLogger(PagoEventsConsumer.class) ;
	@KafkaListener(topics= {"pago-event"})
	public void onMessage(ConsumerRecord<Integer,String> consumerRecord) throws  JsonProcessingException {
		
		log.info("ConsumerRecord account : {} ",consumerRecord);
		pagoEvents.processTransacctionEvent(consumerRecord);
		
	}
	
}
