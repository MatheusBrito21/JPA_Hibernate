package relacionamentos.umPraMuitos;

import java.util.Date;

import infra.DAO;
import modelo.Produto;

public class NovoPedido {
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		
		Produto p1 = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido(new Date());
		ItemPedido item = new ItemPedido(pedido, p1, 10);
		
		dao
		.abrirT()
		.incluir(p1)
		.incluir(pedido)
		.incluir(item)
		.fecharT();
		
	}
}
