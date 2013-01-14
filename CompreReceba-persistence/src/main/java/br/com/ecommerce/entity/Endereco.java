/*
 * Endereco.java criado em 11/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Entity
@Table(name = "enderecos")
public class Endereco implements Serializable{
  
  /**
   * 
   */
  private static final long serialVersionUID = 1L;
  
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  
  @Column(name = "rua")
  private String rua;
  
  @Column(name = "numero")
  private String numero;
  
  @Column(name = "complemento")
  private String complemento;
  
  @Column(name = "bairro")
  private String bairro;
  
  @Column(name = "cep")
  private String cep;
  
  @Column(name = "cidade")
  private String cidade;
  
  @Column(name = "estado")
  private String estado;
  
  @ManyToOne
  @JoinColumn(name="clientes_id")
  private Cliente cliente;
  
  public int getId() {
    return id;
  }
  
  public void setId(int id) {
    this.id = id;
  }
  
  public String getRua() {
    return rua;
  }
  
  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getNumero() {
    return numero;
  }
  
  public void setNumero(String numero) {
    this.numero = numero;
  }
  
  public String getComplemento() {
    return complemento;
  }
  
  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }
  
  public String getBairro() {
    return bairro;
  }
  
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }
  
  public String getCep() {
    return cep;
  }
  
  public void setCep(String cep) {
    this.cep = cep;
  }
  
  public String getCidade() {
    return cidade;
  }
  
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  
  public String getEstado() {
    return estado;
  }
  
  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  public Cliente getCliente() {
    return cliente;
  }

  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }

  @Override
  public String toString() {
    return "Endereco [id=" + id + ", rua=" + rua + ", numero=" + numero + ", complemento="
        + complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", estado="
        + estado + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
    result = prime * result + ((cep == null) ? 0 : cep.hashCode());
    result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
    result = prime * result + ((complemento == null) ? 0 : complemento.hashCode());
    result = prime * result + ((estado == null) ? 0 : estado.hashCode());
    result = prime * result + id;
    result = prime * result + ((numero == null) ? 0 : numero.hashCode());
    result = prime * result + ((rua == null) ? 0 : rua.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Endereco other = (Endereco) obj;
    if (bairro == null) {
      if (other.bairro != null)
        return false;
    } else if (!bairro.equals(other.bairro))
      return false;
    if (cep == null) {
      if (other.cep != null)
        return false;
    } else if (!cep.equals(other.cep))
      return false;
    if (cidade == null) {
      if (other.cidade != null)
        return false;
    } else if (!cidade.equals(other.cidade))
      return false;
    if (complemento == null) {
      if (other.complemento != null)
        return false;
    } else if (!complemento.equals(other.complemento))
      return false;
    if (estado == null) {
      if (other.estado != null)
        return false;
    } else if (!estado.equals(other.estado))
      return false;
    if (id != other.id)
      return false;
    if (numero == null) {
      if (other.numero != null)
        return false;
    } else if (!numero.equals(other.numero))
      return false;
    if (rua == null) {
      if (other.rua != null)
        return false;
    } else if (!rua.equals(other.rua))
      return false;
    return true;
  }
  
}