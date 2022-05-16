package relacionamentos.umPraUm;

import infra.DAO;

public class NovoCliente1 {
	public static void main(String[] args) {
		
		Assento a = new Assento("25L");
		Cliente c = new Cliente("Woody", a);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(a)
		.incluir(c)
		.fecharT();
	
		
	}
}
