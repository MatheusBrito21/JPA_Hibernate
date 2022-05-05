package visao;

import java.util.List;

import infra.DAO;
import modelo.Produto;

public class ConsultarProdutos {
	public static void main(String[] args) {
		DAO<Produto> dao = new DAO<>(Produto.class);
		List<Produto> listaProdutos = dao.obterTodosP();
		
		for(Produto p : listaProdutos) {
			System.out.println("ID: "+ p.getId() 
			+ " Nome: "+p.getNome()+ " R$"+p.getPreco());
		}
		
		double total = listaProdutos
				.stream()
				.map(p -> p.getPreco())
				.reduce(0.0,(t,p) -> t + p )
				.doubleValue();
		
		System.out.printf("Total: R$%.2f", total);
	}
}
