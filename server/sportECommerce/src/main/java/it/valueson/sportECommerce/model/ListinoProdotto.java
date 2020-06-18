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
@Table(name = "ListinoProdotto")
public class ListinoProdotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double prezzo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idListino")
	private Listino listino = new Listino();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProdotto")
	private Prodotto prodotto = new Prodotto();

}
