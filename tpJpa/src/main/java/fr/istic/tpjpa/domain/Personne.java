package fr.istic.tpjpa.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


@Entity
public class Personne {

	@Enumerated
	private Genre genres;
	@Id

	@GeneratedValue
	private long id_per;

	public Genre getGenres() {
		return genres;
	}
	public void setGenres(Genre genres) {
		this.genres = genres;
	}
	@OneToMany( cascade = CascadeType.PERSIST) 
	private List<Amis> amis= new ArrayList<Amis>();

	private String Nom;
	private String Prenom;
	
	private String mail;
	private Date date_naiss;
	private String profil;

	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getPrenom() {
		return Prenom;
	}
	public void setPrenom(String prenom) {
		Prenom = prenom;
	}
	
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getDate_naiss() {
		return date_naiss;
	}
	public void setDate_naiss(Date date_naiss) {
		this.date_naiss = date_naiss;
	}
	public String getProfil() {
		return profil;
	}
	public void setProfil(String profil) {
		this.profil = profil;
	}
	public long getId() {
		return id_per;
	}
	public void setId(long id) {
		this.id_per = id;
	}


	public  List<Amis> getA() {
		return amis;
	}
	public void addAmis (List<Amis> amis) {
		this.amis= amis;
	}

}
