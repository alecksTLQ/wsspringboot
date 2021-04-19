package com.consumir.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate; 

import com.consumir.ws.servicio.*;

@Service
public class soapclient {
	
	@Autowired
	private Jaxb2Marshaller marshaller;
	
	private WebServiceTemplate template;
	
	public TipoCambioDiaResponse getTipocambio() {	
		template =  new WebServiceTemplate(marshaller);
		TipoCambioDiaResponse tipocambio = (TipoCambioDiaResponse) template.marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio");
		return tipocambio;
	}
	
	/*public TipoCambioDiaResponse getTipoCambio() {
		Object request = null;
		JAXBElement res = (JAXBElement) getWebServiceTemplate().marshalSendAndReceive("https://www.banguat.gob.gt/variables/ws/TipoCambio.asmx?WSDL", request);
		return (TipoCambioDiaResponse) res.getValue();
	}*/
}
