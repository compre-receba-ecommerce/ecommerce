/*
 * ItensPedidos.java criado em 13/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Entity
@Table(name = "itens_pedidos")
public class ItensPedidos implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ItemPedidoID itemPedidoId = new ItemPedidoID();

	@Column(name = "desconto")
	private double desconto;

	@Column(name = "quantidade")
	private int quantidade;

	public ItemPedidoID getItemPedidoId() {
		return itemPedidoId;
	}

	public void setItemPedidoId(ItemPedidoID itemPedidoId) {
		this.itemPedidoId = itemPedidoId;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

}