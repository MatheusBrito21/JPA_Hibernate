package relacionamentos.muitosPraMuitos;

import infra.DAO;

public class NovoFilmeAtor {
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars IV",8.7 );
		Filme filmeB = new Filme("Indiana Jones", 9.4);
		Filme filmeC = new Filme("O Iluminado", 8.4);
		
		Ator ator1 = new Ator("Harrison Ford");
		Ator atriz1 = new Ator("Carrie Fisher");
		Ator ator2 = new Ator("Jack Nicholson");
		
		filmeA.adicionarAtor(ator1);
		filmeA.adicionarAtor(atriz1);
		
		filmeB.adicionarAtor(ator1);
		
		DAO<Filme> daoF = new DAO<Filme>();
		daoF.incluirAtomico(filmeA);
		
		ator2.adicionarFilme(filmeC);
		DAO<Ator> daoA = new DAO<>();
		daoA.incluirAtomico(ator2);
	}
}
