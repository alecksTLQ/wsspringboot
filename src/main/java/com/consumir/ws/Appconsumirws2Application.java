package com.consumir.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumir.ws.client.soapclient;
import com.consumir.ws.servicio.TipoCambioDiaResponse;

@SpringBootApplication
@RestController
public class Appconsumirws2Application {
	
	@Autowired
	private soapclient client;
	
	@GetMapping("/tipocambio")
	public TipoCambioDiaResponse invokeSoapClient() {
		return client.getTipocambio();
	}
	

	public static void main(String[] args) {
		SpringApplication.run(Appconsumirws2Application.class, args);
	}

}
