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
@Table(name = "PriceListProduct")
public class PriceListProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double price;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idPriceList")
	private PriceList priceList = new PriceList();
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProduct")
	private Product product = new Product();

}
