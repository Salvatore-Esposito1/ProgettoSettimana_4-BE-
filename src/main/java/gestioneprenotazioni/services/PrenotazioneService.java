package gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneprenotazioni.model.Prenotazione;
import gestioneprenotazioni.repository.PrenotazioneRepository;

@Service
public class PrenotazioneService {

	@Autowired
	private PrenotazioneRepository prenotazioneRep;

	public void creaPrenotazioni(Prenotazione prenotazione) {
		if (!prenotazioneRep.existsByUtenteIdAndData(prenotazione.getUtente().getId(), prenotazione.getData())) {

			prenotazioneRep.save(prenotazione);
		}

	}

	public List<Prenotazione> trovaTuttePrenotazioni() {

		return (List<Prenotazione>) prenotazioneRep.findAll();
	}

	public Prenotazione trovaPrenotazionePerId(Long id) {
		return prenotazioneRep.findById(id).get();
	}

	public List<Prenotazione> trovaPrenotazionePerIdUtente(Long id) {
		return prenotazioneRep.trovaPrenotazionePerUtenteId(id);
	}
}
