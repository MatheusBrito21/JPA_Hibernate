package visao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import modelo.Usuario;

public class ConsultarUsuarios {
	public static void main(String[] args) {
		
		EntityManager em = FabricaConexao.getEm();
		
		
		String jpql = "select u from Usuario u";
		//busca por tipo
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		//limita a quantidade de resultados
		query.setMaxResults(5);
		
		List<Usuario> lista = query.getResultList();
		
		for(Usuario u: lista) {
			System.out.println("Id:"+u.getId()+" Nome:"+u.getNome());
		}
		em.close();
		
		
	}
}
