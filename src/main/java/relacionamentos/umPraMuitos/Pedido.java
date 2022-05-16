package relacionamentos.umPraMuitos;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	//Define o id e a estratégia de geração de valor
	//Identity -> cada instancia tera um valor único e sequencial
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	//define que a coluna não aceita valores nulos
	@Column(nullable = false)
	private Date data;
	
	//faz a relação Bidirecional Um pra Muitos com a classe ItemPedido
	//F.Key -> P.Key da classe ItemPedido
	//Obrigatório, a menos que o relacionamento seja unidirecional.
	@OneToMany(mappedBy = "pedido")
	private List<ItemPedido> itens;
	
	
	public Pedido() {
		
	}
	
	public Pedido(Date data) {
		this.data = data;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public List<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItemPedido> itens) {
		this.itens = itens;
	}
	
	
}
