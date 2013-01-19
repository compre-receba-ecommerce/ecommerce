/*
 * ItensPedidosDaoImpl.java criado em 13/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.ItensPedidosDAO;
import br.com.ecommerce.entity.ItensPedidos;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("itensPedidosDao")
@Transactional
public class ItensPedidosDaoImpl implements ItensPedidosDAO {

  private HibernateTemplate hibernateTemplate;

  public ItensPedidosDaoImpl(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(ItensPedidos itensPedidos) {
    hibernateTemplate.saveOrUpdate(itensPedidos);
  }

  @SuppressWarnings("unchecked")
  public List<ItensPedidos> getAll() {
    return hibernateTemplate.
        find("FROM " + ItensPedidos.class.getName());
  }

  public ItensPedidos selectById(String id) {
    return hibernateTemplate.get(ItensPedidos.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(ItensPedidos itensPedidos) {
    hibernateTemplate.delete(itensPedidos);
  }

}