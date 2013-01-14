/*
 * Produtos.java criado em 11/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Entity
@Table(name = "produtos")
public class Produto implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(generator = "system-uuid")
  @Column(name = "id")
  private int id;
  
  @Column(name = "ativo")
  private boolean ativo;
  
  @Column(name = "marca")
  private String marca;
  
  @Column(name = "nome")
  private String nome;
  
  @Column(name = "preco")
  private double preco;
  
  @Column(name = "taxa_entrega")
  private double taxaEntrega;

  @ManyToOne
  @JoinColumn(name="itens_pedidos")
  private ItensPedidos itensPedidos;
  
  @ManyToOne
  @JoinColumn(name="categorias_id")
  private Categoria categoria;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public boolean isAtivo() {
    return ativo;
  }
  
  public void setAtivo(boolean ativo) {
    this.ativo = ativo;
  }
  
  public String getMarca() {
    return marca;
  }
  
  public void setMarca(String marca) {
    this.marca = marca;
  }
  
  public String getNome() {
    return nome;
  }
  
  public void setNome(String nome) {
    this.nome = nome;
  }
  
  public double getPreco() {
    return preco;
  }
  
  public void setPreco(double preco) {
    this.preco = preco;
  }
  
  public double getTaxaEntrega() {
    return taxaEntrega;
  }
  
  public void setTaxaEntrega(double taxaEntrega) {
    this.taxaEntrega = taxaEntrega;
  }
  
  public ItensPedidos getItensPedidos() {
    return itensPedidos;
  }
  
  public void setItensPedidos(ItensPedidos itensPedidos) {
    this.itensPedidos = itensPedidos;
  }
  
  public Categoria getCategoria() {
    return categoria;
  }
  
  public void setCategoria(Categoria categoria) {
    this.categoria = categoria;
  }
  
  public String toString() {
    return getMarca() + " - " + " - " + getNome() + getId();
  }

  public boolean equals(Object o) {
    if (o == null)
      return false;
    if (this == o)
      return true;
    boolean result = false;
    if (o instanceof Cliente) {
      Cliente outro = (Cliente) o;
      result = this.getNome() != null &&
          this.getNome().equals(outro.getEmail());
    }
    return result;
  }

  public int hashCode() {
    int result = getNome() != null ? getNome().hashCode() : 41;
    return result;
  }
  
}