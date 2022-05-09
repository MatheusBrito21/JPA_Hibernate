package visao;

import infra.DAO;
import relacionamentos.umPraUm.Assento;
import relacionamentos.umPraUm.Cliente;

public class NovoCliente1 {
	public static void main(String[] args) {
		
		Assento a = new Assento("1A");
		Cliente c = new Cliente("Bia", a);
		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirT()
		.incluir(a)
		.incluir(c)
		.fecharT()
		.fecharEM();
	
		
	}
}
