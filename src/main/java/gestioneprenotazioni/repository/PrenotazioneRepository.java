package gestioneprenotazioni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestioneprenotazioni.model.Prenotazione;

@Repository
public interface PrenotazioneRepository extends CrudRepository<Prenotazione, Long> {
	public boolean existsByUtenteIdAndData(Long id, LocalDate data);

	@Query("SELECT p FROM Prenotazioni p WHERE p.utente.id = :id")
	public List<Prenotazione> trovaPrenotazionePerUtenteId(Long id);

}
