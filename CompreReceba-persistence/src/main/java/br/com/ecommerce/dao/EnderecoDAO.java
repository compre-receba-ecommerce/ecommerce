/*
 * EnderecosDAO.java criado em 11/01/2013
 */
package br.com.ecommerce.dao;

import java.util.List;

import br.com.ecommerce.entity.Endereco;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
public interface EnderecoDAO {
  
  public void save(Endereco endereco);
  
  public List<Endereco> getAll();
  
  public List<Endereco> selectByRua(String rua);
  
  public List<Endereco> selectByCep(String cep);
  
  public Endereco selectById(String id);
  
  public void delete(Endereco endereco);

}