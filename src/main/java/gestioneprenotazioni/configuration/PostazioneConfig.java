package gestioneprenotazioni.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import gestioneprenotazioni.model.Postazione;
import gestioneprenotazioni.model.TipoPostazione;
import gestioneprenotazioni.services.EdificioService;

@Configuration
public class PostazioneConfig {

	@Autowired
	private EdificioService edificioService;
	

	@Bean("postazione1")
	@Scope("prototype")
	public Postazione newPostazione() {

		Postazione postazione = new Postazione();
		postazione.setCodiceUnivoco(1);
		postazione.setDescrizione("Descrizione");
		postazione.setTipoPostazione(TipoPostazione.OPENSPACE);
		postazione.setNMaxOccupanti(8);
		postazione.setEdificio(edificioService.trovaEdificioPerId(2l));
		
		return postazione;

	}
}
