package it.valueson.sportECommerce.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ProdottoOrdine")
public class ProdottoOrdine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer quantita;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProdotto")
	private Prodotto prodotto = new Prodotto();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idOrdine")
	private Ordine ordine = new Ordine();

}
