/*
 * PedidoDaoImpl.java criado em 13/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.PedidoDAO;
import br.com.ecommerce.entity.Pedido;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("pedidoDao")
@Transactional
public class PedidoDaoImpl implements PedidoDAO {

  private HibernateTemplate hibernateTemplate;

  public PedidoDaoImpl(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(Pedido pedido) {
    hibernateTemplate.saveOrUpdate(pedido);
  }

  @SuppressWarnings("unchecked")
  public List<Pedido> getAll() {
    return hibernateTemplate.
        find("FROM " + Pedido.class.getName());
  }

  @SuppressWarnings("unchecked")
  public List<Pedido> selectByStatus(String status) {
    return hibernateTemplate.
        find("FROM Pedido p WHERE p.status= ?", status);
  }

  public Pedido selectByNumero(String numero) {
    return hibernateTemplate.get(Pedido.class, numero);
  }

  @SuppressWarnings("unchecked")
  public List<Pedido> selectByData(Date date) {
    return hibernateTemplate.
        find("FROM Pedido p WHERE p.data=?", date);
  }

  @Transactional(readOnly = false)
  public void delete(Pedido pedido) {
    hibernateTemplate.delete(pedido);
  }

}
