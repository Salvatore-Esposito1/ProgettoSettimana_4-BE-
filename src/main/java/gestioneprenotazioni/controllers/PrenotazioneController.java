package gestioneprenotazioni.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import gestioneprenotazioni.model.Prenotazione;
import gestioneprenotazioni.services.PrenotazioneService;

@RestController
@RequestMapping("/prenotazioni")
public class PrenotazioneController {

	@Autowired
	PrenotazioneService prenotazioneService;

	@PostMapping("/crea")
	public void creaPrenotazione(@RequestBody Prenotazione prenotazione) {

		prenotazioneService.creaPrenotazioni(prenotazione);
	}

	@GetMapping
	public List<Prenotazione> trovaTuttePrenotazioni() {
		return prenotazioneService.trovaTuttePrenotazioni();
	}

	@GetMapping("/{id}")
	public Prenotazione trovaPrenotazioniPerId(@PathVariable Long id) {
		return prenotazioneService.trovaPrenotazionePerId(id);
	}

	@GetMapping("/test")
	public List<Prenotazione> trovaPrenotazionePerIdUtente(@RequestParam Long id) {
		return prenotazioneService.trovaPrenotazionePerIdUtente(id);
	}
}