package relacionamentos.NamedQuery;

import java.util.List;

import infra.DAO;
import relacionamentos.muitosPraMuitos.Filme;

public class ConsultarFilmes {
	public static void main(String[] args) {
		
		
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmes = dao.consultar("obterPorNota","nota",8.4);
		
		for(Filme filme: filmes) {
			System.out.println(filme.getNome());
		}
	}
}
