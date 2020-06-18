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
@Table(name = "MagazzinoProdotto")
public class MagazzinoProdotto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer quantita;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProdotto")
	private Prodotto prodotto;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMagazzino")
	private Magazzino magazzino;

	
}
