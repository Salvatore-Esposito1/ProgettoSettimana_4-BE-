package gestioneprenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import gestioneprenotazioni.model.Edificio;

@Configuration
public class EdificioConfig {

	@Bean("edificio1")
	@Scope("prototype")
	public Edificio newEdificio() {

		Edificio edificio = new Edificio();
		edificio.setNome("Edificio Epicode");
		edificio.setIndirizzo("Via Roma");
		edificio.setCitta("Milano");

		return edificio;

	}

}
