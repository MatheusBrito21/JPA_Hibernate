package visao;

import javax.persistence.EntityManager;

import modelo.Usuario;

public class AlterarUsuario {
	public static void main(String[] args) {
		
		EntityManager em = FabricaConexao.getEm();
		
		
		Usuario u = em.find(Usuario.class, 11);
		
		em.getTransaction().begin();
		u.setNome("Viúva Negra");
		
		
		em.getTransaction().commit();
		
		em.close();
		
		
	}
}
