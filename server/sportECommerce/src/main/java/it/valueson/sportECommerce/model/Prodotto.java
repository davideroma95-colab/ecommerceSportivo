package it.valueson.sportECommerce.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prodotto")
public class Prodotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String codice;
	private String descrizione;
	private Date dataInserimento;
	private Date dataSoppressione;
	@OneToMany(mappedBy = "prodotto")
	private List<MagazzinoProdotto> magazzinoProdotti;
	@OneToMany(mappedBy = "prodotto")
	private List<ProdottoOrdine> prodottoOrdini;
}
