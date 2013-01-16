/*
 * UsuarioDAO.java criado em 11/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Usuario;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface UsuarioDAO {
  
  public void save(Usuario usuario);
  
  public List<Usuario> getAll();
  
  public Usuario selectbyEmail(String email);
  
  public List<Usuario> selectByNome(String nome);
  
  public Usuario selectById(String id);
  
  public void delete(Usuario usuario);

}