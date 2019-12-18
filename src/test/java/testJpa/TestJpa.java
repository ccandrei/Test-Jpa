package testJpa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import tp.Jpa.*;

public class TestJpa {
	
	public static void main (String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("bibliothéque");
		EntityManager em =entityManagerFactory.createEntityManager();
		
		Livre li = em.find(Livre.class, 2);
		System.out.println(li.getTitre());
		
		em.close();
		entityManagerFactory.close();
		
	}
	
	
}
