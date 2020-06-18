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
@Table(name = "AzioneProfilo")
public class AzioneProfilo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idProdfilo")
	private Profilo profilo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idAzione")
	private Azione azione;

}
