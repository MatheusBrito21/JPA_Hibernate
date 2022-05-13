package relacionamentos.umPraMuitos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import modelo.Produto;

@Entity
public class ItemPedido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto prod;
	
	
	@Column(nullable = false)
	private int qtd;
	private Double preco;
	
	
	public ItemPedido() {
		
	}
	
	public ItemPedido(Pedido pedido, Produto prod, int qtd) {
		this.setPedido(pedido);
		this.setProd(prod);
		this.setQtd(qtd);
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public Produto getProd() {
		return prod;
	}
	public void setProd(Produto prod) {
		this.prod = prod;
		
		if(prod != null && this.preco == null) {
			this.setPreco(prod.getPreco());
		}
	}
	public int getQtd() {
		return qtd;
	}
	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	
}
