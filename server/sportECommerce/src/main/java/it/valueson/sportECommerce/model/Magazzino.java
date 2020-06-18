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
@Table(name = "Magazzino")
public class Magazzino {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String indirizzo;
	private Date dataApertura;
	private Date dataChiusura;
	@OneToMany(mappedBy = "magazzino")
	private List<MagazzinoProdotto> magazzinoProdotti = new ArrayList<MagazzinoProdotto>();

}
