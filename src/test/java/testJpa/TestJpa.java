package testJpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import entites.*;
import java.util.*;

public class TestJpa {
	
	public static void main (String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliothéque");
		EntityManager em =entityManagerFactory.createEntityManager();
		
		/*Livre lireLivre = em.find(Livre.class, 2);
		System.out.println(lireLivre.getTitre());*/
		
		/*TypedQuery<Livre> result1 = em.createQuery("Select l from Livre l where l.titre='Germinal'",Livre.class);
		Livre livre = result1.getResultList().get(0);
		System.out.println(livre.getId() + " / "+livre.getTitre() + " / "+ livre.getAuteur());*/
		
		
		/*TypedQuery<Emprunt> result2 = em.createQuery("Select e from Emprunt e where e.id = 1", Emprunt.class);
		Emprunt emprunt =  result2.getResultList().get(0);
		System.out.println("\n" +emprunt);*/
		
		
		em.close();
		entityManagerFactory.close();
		

		
	}
	
	
}
