/*
 * ProdutoDAO.java criado em 11/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Produto;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface ProdutoDAO {

  public void save(Produto produto);
  
  public List<Produto> getAll();
  
  public Produto selectbyMarca(String marca);
  
  public List<Produto> selectByNome(String nome);
  
  public Produto selectById(String id);
  
  public void delete(Produto produto);
  
}