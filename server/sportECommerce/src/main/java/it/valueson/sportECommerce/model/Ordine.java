package it.valueson.sportECommerce.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Ordine")
public class Ordine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date data;
	private Date dataAnnullamento;
	@ManyToOne
	@JoinColumn(name = "idStato")
	private Stato stato = new Stato();
	@ManyToOne
	@JoinColumn(name = "idUtente")
	private Utente utente = new Utente();
	@OneToMany(mappedBy = "ordine")
	private List<ProdottoOrdine> prodottoOrdini;

}
