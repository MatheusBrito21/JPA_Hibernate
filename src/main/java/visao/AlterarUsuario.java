package visao;

import javax.persistence.EntityManager;

import modelo.Usuario;

public class AlterarUsuario {
	public static void main(String[] args) {
		
		EntityManager em = FabricaConexao.getEm();
		
		
		Usuario u = em.find(Usuario.class, 4);
		
		em.getTransaction().begin();
		
		u.setEmail("thor@gmail.com");
		u.setNome("Thor Odinson");
		
		em.merge(u);
		
		em.getTransaction().commit();
		
		em.getEntityManagerFactory().close();
		em.close();
		
		
	}
}
