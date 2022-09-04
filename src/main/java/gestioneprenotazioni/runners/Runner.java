package gestioneprenotazioni.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import gestioneprenotazioni.configuration.EdificioConfig;
import gestioneprenotazioni.configuration.PostazioneConfig;
import gestioneprenotazioni.configuration.PrenotazioneConfig;
import gestioneprenotazioni.configuration.UtenteConfig;
import gestioneprenotazioni.services.EdificioService;
import gestioneprenotazioni.services.PostazioneService;
import gestioneprenotazioni.services.PrenotazioneService;
import gestioneprenotazioni.services.UtenteService;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class Runner implements ApplicationRunner {

	@Autowired EdificioService edificioService; PostazioneService postazioneService;
	@Autowired PrenotazioneService prenotazioneService; UtenteService utenteService;
	@Autowired EdificioConfig edificioConfig; PostazioneConfig postazioneConfig;
	@Autowired PrenotazioneConfig prenotazioneConfig; UtenteConfig utenteConfig;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		log.info("----------GESTIONE PRENOTAZIONI----------");
		
		edificioService.creaEdificio( edificioConfig.newEdificio() );
		
		utenteService.creaUtente( utenteConfig.newUtente() );
		
		prenotazioneService.creaPrenotazioni(prenotazioneConfig.newPrenotazione());

	}

}
