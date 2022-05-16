package relacionamentos.umPraUm;

import infra.DAO;

public class NovoCliente2 {
	public static void main(String[] args) {
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		
		Assento a = new Assento("6C");
		Cliente c = new Cliente("Arthur", a);
		
		dao.incluirAtomico(c);
		
	}
}	
