/*
 * ItensPedidos.java criado em 13/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Entity
@Table(name = "itens_pedidos")
public class ItensPedidos implements Serializable{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(generator = "system-uuid")
  @Column(name = "id")
  private int id;
  
  @Column(name = "desconto")
  private double desconto;
  
  @Column(name = "quantidade")
  private int quantidade;
  
  @ManyToOne
  @JoinColumn(name="pedidos_numero")
  private Pedido pedido;
  
  @OneToMany
  private List<Produto> produtos;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
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
  
  public Pedido getPedido() {
    return pedido;
  }
  
  public void setPedido(Pedido pedido) {
    this.pedido = pedido;
  }
  
  public List<Produto> getProdutos() {
    return produtos;
  }
  
  public void setProdutos(List<Produto> produtos) {
    this.produtos = produtos;
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