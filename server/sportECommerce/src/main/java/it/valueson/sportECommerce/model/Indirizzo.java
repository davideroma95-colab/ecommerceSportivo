package it.valueson.sportECommerce.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Indirizzo")
public class Indirizzo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String tipologia;
	private String nome;
	private String civico;
	private String cap;
	private String citta;
	private String nazione;
	private String note;
	private Date dataInserimento;
	private Date dataRimozione;
	@ManyToOne
	@JoinColumn(name = "idUtente")
	private Utente utente;

}
