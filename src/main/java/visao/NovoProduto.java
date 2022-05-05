package visao;

import infra.DAO;
import modelo.Produto;

public class NovoProduto {
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		
		Produto p = new Produto("Monitor", 789.95);
		
//		dao.abrirT().incluir(p).fecharT().fecharEM();
		dao.incluirAtomico(p);
		System.out.println("Id do produto: "+ p.getId());
	}
}
