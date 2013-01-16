/*
 * PerfilDAO.java criado em 13/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Perfil;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface PerfilDAO {

  public void save(Perfil perfil);
  
  public List<Perfil> getAll();
  
  public List<Perfil> selectByNome(String nome);
  
  public Perfil selectById(String id);
  
  public void delete(Perfil perfil);
  
}