package gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import gestioneprenotazioni.model.Utente;
import gestioneprenotazioni.repository.UtenteRepository;

public class UtenteService {

	@Autowired
	private UtenteRepository utenteRep;

	public void creaUtente(Utente utente) {
		utenteRep.save(utente);
	}

	public List<Utente> trovaTuttiUtenti() {
		return (List<Utente>) utenteRep.findAll();
	}

	public Utente trovaUtentePerId(Long id) {
		return utenteRep.findById(id).get();
	}
}
