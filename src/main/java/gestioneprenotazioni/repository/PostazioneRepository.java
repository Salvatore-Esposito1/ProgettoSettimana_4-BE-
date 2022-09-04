package gestioneprenotazioni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestioneprenotazioni.model.Postazione;
import gestioneprenotazioni.model.TipoPostazione;

@Repository
public interface PostazioneRepository extends CrudRepository<Postazione, Long> {
	@Query("SELECT p FROM Postazioni p WHERE p.edificio.citta = :citta AND p.tipoPostazione = :tipoPostazione")
	public List<Postazione> findByCittaAndTipoPostazione(String citta, TipoPostazione tipoPostazione);
}
