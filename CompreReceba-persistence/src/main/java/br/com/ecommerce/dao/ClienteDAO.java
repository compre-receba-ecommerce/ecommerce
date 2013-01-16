/*
 * ClientesDAO.java criado em 11/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Cliente;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface ClienteDAO {

  public void save(Cliente clientes);
  
  public List<Cliente> getAll();
  
  public Cliente selectbyEmail(String email);
  
  public List<Cliente> selectByNome(String nome);
  
  public Cliente selectById(String id);
  
  public void delete(Cliente clientes);
  
}