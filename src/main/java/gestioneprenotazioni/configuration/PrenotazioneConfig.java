package gestioneprenotazioni.configuration;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import gestioneprenotazioni.model.Postazione;
import gestioneprenotazioni.model.Prenotazione;
import gestioneprenotazioni.model.Utente;
import gestioneprenotazioni.services.PostazioneService;
import gestioneprenotazioni.services.UtenteService;

@Configuration
public class PrenotazioneConfig {

	@Autowired
	private PostazioneService postazioneService;

	@Autowired
	private UtenteService utenteService;
	
	@Autowired
	@Qualifier("utente1")
	Utente utente1;
	
	@Autowired
	@Qualifier("postazione1")
	Postazione postazione1;

	@Scope("prototype")
	public Prenotazione newPrenotazione() {

		Prenotazione prenotazione = new Prenotazione();
		prenotazione.setUtente(utente1);
		prenotazione.setPostazione(postazione1);
		prenotazione.setData(LocalDate.of(2022, 05, 20));
		
		return prenotazione;

	}
}
