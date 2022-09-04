package gestioneprenotazioni.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Postazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceUnivoco;
	
	@Column(length = 50)
	private String descrizione;
	
	@NonNull
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipoPostazione;
	
	@NonNull
	private Integer nMaxOccupanti;
	
	@ManyToOne
	private Edificio edificio;
	
}