package gestioneprenotazioni.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import gestioneprenotazioni.model.Edificio;

@Repository
public interface EdificioRepository extends CrudRepository<Edificio, Long> {



}
