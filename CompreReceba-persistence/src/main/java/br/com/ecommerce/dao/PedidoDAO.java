/*
 * PedidoDAO.java criado em 13/01/2013
 */
package br.com.ecommerce.dao;

import java.util.Date;
import java.util.List;

import br.com.ecommerce.entity.Pedido;


/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface PedidoDAO {
  
  public void save(Pedido pedido);
  
  public List<Pedido> getAll();
  
  public List<Pedido> selectByStatus(String status);
  
  public Pedido selectByNumero(String numero);
  
  public List<Pedido> selectByData(Date date);
  
  public void delete(Pedido pedido);

}