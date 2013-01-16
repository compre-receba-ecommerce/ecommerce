/*
 * EnderecosDaoImpl.java criado em 11/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.EnderecoDAO;
import br.com.ecommerce.entity.Endereco;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository
@Transactional("EnderecoDAO")
public class EnderecoDaoImpl implements EnderecoDAO{

  private HibernateTemplate hibernateTemplate;

  @Autowired
  public void setSessionFactory(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }
  
  @Transactional(readOnly = false)
  public void save(Endereco endereco) {
    hibernateTemplate.saveOrUpdate(endereco);
  }

  @SuppressWarnings("unchecked")
  public List<Endereco> getAll() {
    return (List<Endereco>)hibernateTemplate.
        find("from " + Endereco.class.getName());
  }

  @SuppressWarnings("unchecked")
  public List<Endereco> selectByRua(String rua) {
    return (List<Endereco>) hibernateTemplate.
        find("from Endereco e WHERE e.rua= ?", rua);
  }

  @SuppressWarnings("unchecked")
  public List<Endereco> selectByCep(String cep) {
    return (List<Endereco>) hibernateTemplate.
        find("from Endereco e WHERE e.cep= ?", cep);
  }

  public Endereco selectById(String id) {
    return hibernateTemplate.get(Endereco.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(Endereco endereco) {
    hibernateTemplate.delete(endereco);
  }

}