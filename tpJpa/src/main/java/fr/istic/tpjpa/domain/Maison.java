package fr.istic.tpjpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Maison {
	@Id
	@GeneratedValue
	private long id;
	
	private String adresse;
	private int superficie;
	private String ip_adresse;
	private int nb_pieces;
    private int nb_chauffage;
    

	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}
	public String getIp_adresse() {
		return ip_adresse;
	}
	public void setIp_adresse(String ip_adresse) {
		this.ip_adresse = ip_adresse;
	}
	public int getNb_pieces() {
		return nb_pieces;
	}
	public void setNb_pieces(int nb_pieces) {
		this.nb_pieces = nb_pieces;
	}
	public int getNb_chauffage() {
		return nb_chauffage;
	}
	public void setNb_chauffage(int nb_chauffage) {
		this.nb_chauffage = nb_chauffage;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
    

}
