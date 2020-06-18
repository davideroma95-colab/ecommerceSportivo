package it.valueson.sportECommerce.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Profilo")
public class Profilo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String descrizione;
	@OneToMany(mappedBy = "profilo",fetch = FetchType.LAZY)
	private List<Utente> utenti;
	@OneToMany(mappedBy = "profilo",fetch = FetchType.LAZY)
	private List<AzioneProfilo> azioneProfili;


}
