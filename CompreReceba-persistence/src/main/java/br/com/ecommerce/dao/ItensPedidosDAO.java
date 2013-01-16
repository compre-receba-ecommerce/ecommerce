/*
 * ItensPedidosDAO.java criado em 13/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.ItensPedidos;


/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface ItensPedidosDAO {

  public void save(ItensPedidos itensPedidos);
  
  public List<ItensPedidos> getAll();
  
  public ItensPedidos selectById(String id);
  
  public void delete(ItensPedidos itensPedidos);
  
}