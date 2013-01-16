/*
 * CategoriaDAO.java criado em 13/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Categoria;


/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface CategoriaDAO {

  public void save(Categoria categoria);
  
  public List<Categoria> getAll();
  
  public List<Categoria> selectByNome(String nome);
  
  public Categoria selectById(String id);
  
  public void delete(Categoria categoria);
  
}