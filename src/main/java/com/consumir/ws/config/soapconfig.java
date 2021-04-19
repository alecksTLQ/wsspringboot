package com.consumir.ws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class soapconfig {
	
	@Bean
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setPackagesToScan("com.consumir.ws.servicio");
		return marshaller;
	}
	
	/*@Bean
	public soapclient clientt(Jaxb2Marshaller marshaller) {
		soapclient client = new soapclient();
		client.setDefaultUri("");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		return client;
	}*/
}
