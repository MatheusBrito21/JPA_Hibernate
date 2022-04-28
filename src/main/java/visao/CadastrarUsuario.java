package visao;

import javax.persistence.EntityManager;

import modelo.Usuario;

public class CadastrarUsuario {
	public static void main(String[] args) {
	
		EntityManager em = FabricaConexao.getEm();
		
		Usuario u1 = new Usuario("Steve Rogers", "cap@gmail.com");
		Usuario u2 = new Usuario("Tony Stark", "tony@gmail.com");
		Usuario u3 = new Usuario("Bruce Banner", "hulk@gmail.com");
		Usuario u4 = new Usuario("Thor", "strg_avenger@gmail.com");

		em.getTransaction().begin();
		em.persist(u1);
		em.persist(u2);
		em.persist(u3);
		em.persist(u4);
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Pronto!!!");
	}
}
