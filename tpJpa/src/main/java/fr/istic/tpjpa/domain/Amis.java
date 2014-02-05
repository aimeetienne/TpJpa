package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
 

 @Entity

public class Amis {
	@Id
	@GeneratedValue
	private long id_amis;
	private String Nom;
	private String prenom;
 
	@ManyToOne 
	private Personne id_personne;
	public long getId() {
		return id_amis;
	}

	public void setId(long id_amis) {
		this.id_amis = id_amis;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Personne getId_personne() {
		return id_personne;
	}

	public void setId_personne(Personne id_personne) {
		this.id_personne = id_personne;
	}
	

}
