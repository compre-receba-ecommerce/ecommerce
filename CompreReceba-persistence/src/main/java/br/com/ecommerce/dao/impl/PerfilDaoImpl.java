/*
 * PerfilDaoImpl.java criado em 13/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.PerfilDAO;
import br.com.ecommerce.entity.Perfil;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("PerfilDAO")
@Transactional
public class PerfilDaoImpl implements PerfilDAO{
  
  private HibernateTemplate hibernateTemplate;
  
  @Autowired
  public void setSessionFactory(SessionFactory sessionFactory){
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(Perfil perfil) {
    hibernateTemplate.saveOrUpdate(perfil);
  }

  @SuppressWarnings("unchecked")
  public List<Perfil> getAll() {
    return hibernateTemplate.
        find("FROM " + Perfil.class.getName());
  }

  @SuppressWarnings("unchecked")
  public List<Perfil> selectByNome(String nome) {
    return hibernateTemplate.
        find("FROM Perfil p WHERE p.nome=?", nome);
  }

  public Perfil selectById(String id) {
    return hibernateTemplate.get(Perfil.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(Perfil perfil) {
    hibernateTemplate.delete(perfil);
  }
  
}