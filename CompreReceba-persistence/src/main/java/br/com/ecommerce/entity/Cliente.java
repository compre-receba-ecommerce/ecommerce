/*
 * Clientes.java criado em 11/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Entity
@Table(name = "clientes")
public class Cliente implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 8496087166198616020L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;

  @Column(name = "ativo")
  private boolean ativo;

  @Column(name = "nome")
  private String nome;

  @Column(name = "sobrenome")
  private String sobrenome;

  @Email
  @Column(name = "email")
  private String email;

  @Column(name = "senha")
  private String senha;

  @Column(name = "telefone")
  private String telefone;

  @OneToMany
  private List<Endereco> enderecos;

  @OneToMany
  private List<Pedido> pedidos;

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

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public List<Endereco> getEnderecos() {
    return enderecos;
  }

  public void setEnderecos(List<Endereco> enderecos) {
    this.enderecos = enderecos;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

  public void setPedidos(List<Pedido> pedidos) {
    this.pedidos = pedidos;
  }

  public String toString() {
    return getEmail() + " - " + getId();
  }

  public boolean equals(Object o) {
    if (o == null)
      return false;
    if (this == o)
      return true;
    boolean result = false;
    if (o instanceof Cliente) {
      Cliente outro = (Cliente) o;
      result = this.getEmail() != null &&
          this.getEmail().equals(outro.getEmail());
    }
    return result;
  }

  public int hashCode() {
    int result = getEmail() != null ? getEmail().hashCode() : 41;
    return result;
  }

}