/*
 * Pedido.java criado em 13/01/2013
 */
package br.com.ecommerce.entity;

import java.io.Serializable;
import java.util.Date;
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
@Table(name = "pedidos")
public class Pedido implements Serializable{

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "system-uuid")
  @Column(name = "numero")
  private int numero;
  
  @Column(name = "cliente_browser")
  private String clienteBrowser;
  
  @Column(name = "cliente_ip")
  private String clienteIP;
  
  @Column(name = "data")
  private Date date;
  
  @Column(name = "status")
  private String status;
  
  @ManyToOne
  @JoinColumn(name="clientes_id")
  private Cliente cliente;
  
  @OneToMany
  private List<ItensPedidos> itensPedidos;
  
  public int getNumero() {
    return numero;
  }
  
  public void setNumero(int numero) {
    this.numero = numero;
  }
  
  public String getClienteBrowser() {
    return clienteBrowser;
  }
  
  public void setClienteBrowser(String clienteBrowser) {
    this.clienteBrowser = clienteBrowser;
  }
  
  public String getClienteIP() {
    return clienteIP;
  }
  
  public void setClienteIP(String clienteIP) {
    this.clienteIP = clienteIP;
  }
  
  public Date getDate() {
    return date;
  }
  
  public void setDate(Date date) {
    this.date = date;
  }
  
  public String getStatus() {
    return status;
  }
  
  public void setStatus(String status) {
    this.status = status;
  }
  
  public Cliente getCliente() {
    return cliente;
  }
  
  public void setCliente(Cliente cliente) {
    this.cliente = cliente;
  }
  
  public List<ItensPedidos> getItensPedidos() {
    return itensPedidos;
  }
  
  public void setItensPedidos(List<ItensPedidos> itensPedidos) {
    this.itensPedidos = itensPedidos;
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