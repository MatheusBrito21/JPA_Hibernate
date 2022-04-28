package visao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FabricaConexao {
	public static EntityManager getEm() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulaJPA_Maven");
		EntityManager em = emf.createEntityManager();
		return em;
	}
}
