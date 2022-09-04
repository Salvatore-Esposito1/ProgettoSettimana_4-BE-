package gestioneprenotazioni.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import gestioneprenotazioni.model.Utente;

@Configuration
public class UtenteConfig {

	@Bean("utente1")
	@Scope("prototype")
	public Utente newUtente() {

		Utente utente = new Utente();
		utente.setUsername("Nickname");
		utente.setNomeCompleto("Giovanni Russo");
		utente.setEmail("GiovanniRusso@gmail.com");
		return utente;
	}

}
