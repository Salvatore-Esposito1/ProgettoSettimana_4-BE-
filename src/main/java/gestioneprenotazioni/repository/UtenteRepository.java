package gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestioneprenotazioni.model.Utente;

@Repository
public interface UtenteRepository extends CrudRepository<Utente, Long> {

}
