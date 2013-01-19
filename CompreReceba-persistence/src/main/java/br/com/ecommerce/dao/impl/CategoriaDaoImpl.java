/*
 * CategoriaDaoImpl.java criado em 13/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.CategoriaDAO;
import br.com.ecommerce.entity.Categoria;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("categoriaDao")
@Transactional
public class CategoriaDaoImpl implements CategoriaDAO {

  private HibernateTemplate hibernateTemplate;

  public CategoriaDaoImpl(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(Categoria categoria) {
    hibernateTemplate.saveOrUpdate(categoria);
  }

  @SuppressWarnings("unchecked")
  public List<Categoria> getAll() {
    return hibernateTemplate.
        find("FROM " + Categoria.class.getName());
  }

  @SuppressWarnings("unchecked")
  public List<Categoria> selectByNome(String nome) {
    return hibernateTemplate.
        find("FROM Categoria c WHERE c.nome=? ", nome);
  }

  public Categoria selectById(String id) {
    return hibernateTemplate.get(Categoria.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(Categoria categoria) {
    hibernateTemplate.delete(categoria);
  }

}