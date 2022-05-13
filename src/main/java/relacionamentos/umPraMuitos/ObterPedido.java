package relacionamentos.umPraMuitos;

import infra.DAO;

public class ObterPedido {
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorId(3);
		
		for(ItemPedido item: pedido.getItens()) {
			System.out.println(item.getProd().getNome());
		}
		
	}
}
