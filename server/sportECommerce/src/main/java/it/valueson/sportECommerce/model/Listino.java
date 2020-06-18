package it.valueson.sportECommerce.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Listino")
public class Listino {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Date dataInizio;
	private Date dataFine;
	@OneToMany(mappedBy = "listino")
	private List<ListinoProdotto> listinoProdotti = new ArrayList<>();

}
