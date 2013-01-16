package br.com.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class ItemPedidoID implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@ManyToOne
	@JoinColumn(name = "produtos_id")
	private Produto produtos_id;

	@ManyToOne
	@JoinColumn(name = "pedidos_numero")
	private Pedido pedidos_numero;

	public ItemPedidoID() {
	}

	public ItemPedidoID(Produto produtos_id, Pedido pedidos_numero) {
		super();
		this.produtos_id = produtos_id;
		this.pedidos_numero = pedidos_numero;
	}

	public Produto getProdutos_id() {
		return produtos_id;
	}

	public void setProdutos_id(Produto produtos_id) {
		this.produtos_id = produtos_id;
	}

	public Pedido getPedidos_numero() {
		return pedidos_numero;
	}

	public void setPedidos_numero(Pedido pedidos_numero) {
		this.pedidos_numero = pedidos_numero;
	}

}
