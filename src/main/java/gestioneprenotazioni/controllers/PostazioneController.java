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

import gestioneprenotazioni.model.Postazione;
import gestioneprenotazioni.model.TipoPostazione;
import gestioneprenotazioni.services.PostazioneService;

@RestController
@RequestMapping("/postazioni")
public class PostazioneController {

	@Autowired
	PostazioneService postazioneService;

	@PostMapping("/crea")
	public void creaPostazione(@RequestBody Postazione postazione) {

		postazioneService.creaPostazione(postazione);
	}

	@GetMapping
	public List<Postazione> trovaTuttePostazioni() {
		return postazioneService.trovaTuttePostazioni();
	}

	@GetMapping("/{id}")
	public Postazione trovaPostazionePerId(@PathVariable   Long id) {
		return postazioneService.trovaPostazionePerId(id);
	}

	@GetMapping("/test")
	public List<Postazione> trovaPostazionePerEdificioETipo(@RequestParam String citta,
			@RequestParam TipoPostazione tipoPostazione) {
		return postazioneService.trovaPostazionePerEdificioETipo(citta, tipoPostazione);
	}
}