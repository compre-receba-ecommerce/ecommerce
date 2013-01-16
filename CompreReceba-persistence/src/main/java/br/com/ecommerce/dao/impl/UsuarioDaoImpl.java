/*
 * UsuarioDaoImpl.java criado em 11/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.entity.Usuario;


/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("UsuarioDAO")
@Transactional
public class UsuarioDaoImpl {

  private HibernateTemplate hibernateTemplate;

  @Autowired
  public void setSessionFactory(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(Usuario usuario) {
    hibernateTemplate.saveOrUpdate(usuario);
  }

  @SuppressWarnings("unchecked")
  public List<Usuario> getAll() {
    return (List<Usuario>) hibernateTemplate.
        find("from " + Usuario.class.getName());
  }

  public Usuario selectbyEmail(String email) {
    return hibernateTemplate.get(Usuario.class, email);
  }

  @SuppressWarnings("unchecked")
  public List<Usuario> selectByNome(String nome) {
    return (List<Usuario>) hibernateTemplate.
        find("from Usuario u WHERE u.nome=?", nome);
  }

  public Usuario selectById(String id) {
    return hibernateTemplate.get(Usuario.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(Usuario usuario) {
    hibernateTemplate.delete(usuario);
  }
  
}