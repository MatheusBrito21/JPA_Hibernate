package visao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Usuario;

public class Programa {
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulaJPA_Maven");
		EntityManager em = emf.createEntityManager();
		
		Usuario u = em.find(Usuario.class, 1);
		
		
		System.out.println(u.getNome());
		
		em.close();
		emf.close();
		
		System.out.println("Pronto!!!");
	}
}
