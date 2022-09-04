package gestioneprenotazioni.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestioneprenotazioni.model.Postazione;
import gestioneprenotazioni.model.TipoPostazione;
import gestioneprenotazioni.repository.PostazioneRepository;

@Service
public class PostazioneService {


	@Autowired
	private PostazioneRepository postazioneRep;

	public void creaPostazione(Postazione postazione) {
		postazioneRep.save(postazione);
	}

	public List<Postazione> trovaTuttePostazioni() {
		return (List<Postazione>) postazioneRep.findAll();
	}

	public Postazione trovaPostazionePerId(Long id) {
		return postazioneRep.findById(id).get();

	}

	public List<Postazione> trovaPostazionePerEdificioETipo(String citta, TipoPostazione tipoPostazione) {
		return postazioneRep.findByCittaAndTipoPostazione(citta, tipoPostazione);
	}

}
