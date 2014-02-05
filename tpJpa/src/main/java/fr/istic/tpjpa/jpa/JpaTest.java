package fr.istic.tpjpa.jpa;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import fr.istic.tpjpa.domain.Amis;
import fr.istic.tpjpa.domain.Maison;
import fr.istic.tpjpa.domain.Personne;
import fr.istic.tpjpa.domain.Personne.Sexe;

public class JpaTest {

	private EntityManager manager;

	public JpaTest(EntityManager manager) {
		this.manager = manager;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("example");
		EntityManager manager = factory.createEntityManager();
		JpaTest test = new JpaTest(manager);

		EntityTransaction tx = manager.getTransaction();
		tx.begin();

		// TODO create entity

		Personne p = new Personne();
		 
		  List<Amis> amis= new ArrayList<Amis>();
		  
		
		  Amis a= new Amis();
		  Amis a1= new Amis();
		Maison m= new Maison();
		
		
		
		
		Date now= new Date();
		p.setNom("Aimé");
		p.setPrenom("Fanny");
		p.setMail("aime.etienne.lome@gmai.com");
		p.setGenre(p.getGenre().M);
		p.setDate_naiss(now);
		
		p.setNom("Floriant");
		p.setPrenom("Romain");
		p.setMail("aime.fanny@gmail.com");
		p.setGenre(p.getGenre().F);
		p.setDate_naiss(now);
		
		p.setNom("Martin");
		p.setPrenom("Fanny");
		p.setMail("etienne.lome@gmai.com");
		p.setGenre(p.getGenre().F);
		p.setDate_naiss(now);
		
	 a.setNom("demars");
	 a.setPrenom("François");
	 
	 a1.setNom("Etienne");
	 a1.setPrenom("Boudet");
	 
	 amis.add(a);
	 amis.add(a1);
	
	p.addAmis(amis);
		
		m.setAdresse("52 E Rue papu");
		m.setIp_adresse("192.92.0.0");
		m.setNb_chauffage(12);
		m.setNb_pieces(12);
		m.setSuperficie(12);
		
		 
		
		// TODO persist entity
test.manager.persist(p);
test.manager.persist(m);
test.manager.persist(a);
test.manager.persist(a1);
test.InsererPersonne();


		tx.commit();

		// TODO run request

		System.out.println(".. done");
	}
	private void InsererPersonne(){
		
		int id_pers=manager.createQuery("select p from Personne p", Personne.class).getResultList().size();
		if(id_pers==0){
			
			Personne p = new Personne();
			p.setNom("Gabriel");
			p.setPrenom("Delaflore");
			p.setGenre(Sexe.M);
			p.setProfil("tot");
			p.setMail("fannyHelou@yahoo.fr");
			//Srting inserer=manager.createQuery("Insert into Personne"+"values("p.setNom("Gabriel")+","+)");
		}
	}

}
