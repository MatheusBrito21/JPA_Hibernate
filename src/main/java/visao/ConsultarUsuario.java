package visao;

import javax.persistence.EntityManager;

import modelo.Usuario;

public class ConsultarUsuario {
	public static void main(String[] args) {
		
		EntityManager em = FabricaConexao.getEm();
		
		Usuario u = em.find(Usuario.class, 1);
		
		System.out.println(u.getNome());
		
		em.close();
		
	}
}
