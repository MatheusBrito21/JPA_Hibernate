package visao;

import javax.persistence.EntityManager;

import modelo.Usuario;

public class RemoverUsuario {
	public static void main(String[] args) {
		
		EntityManager em = FabricaConexao.getEm();
		
		Usuario u = em.find(Usuario.class, 12);
		
		if(u == null) {
			System.out.println("Não há registro para esse ID.");
		}else {
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
			System.out.println("Removido!");
		}
		em.close();
	}
}
