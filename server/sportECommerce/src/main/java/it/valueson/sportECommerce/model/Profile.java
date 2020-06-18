package it.valueson.sportECommerce.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Profile")
public class Profile {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String description;
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
	private List<User> users = new ArrayList<>();
	@OneToMany(mappedBy = "profile", fetch = FetchType.LAZY)
	private List<ActionProfile> actionProfiles = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public List<ActionProfile> getActionProfiles() {
		return actionProfiles;
	}

	public void setActionProfiles(List<ActionProfile> actionProfiles) {
		this.actionProfiles = actionProfiles;
	}

}
