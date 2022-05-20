package relacionamentos.heranca;

import infra.DAO;

public class NovoAluno {
	public static void main(String[] args) {
		
		DAO<Aluno> aluno = new DAO<>();
		
		Aluno a1  = new Aluno(123456, "João");
		
		AlunoBolsista a2 = new AlunoBolsista(321654, "Maria", 1000.0);
		
		aluno.incluirAtomico(a1);
		aluno.incluirAtomico(a2);
		
		
	}
}
