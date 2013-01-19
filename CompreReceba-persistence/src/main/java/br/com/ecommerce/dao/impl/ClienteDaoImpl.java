/*
 * ClientesDaoImpl.java criado em 11/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.ClienteDAO;
import br.com.ecommerce.entity.Cliente;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */

@Repository("clienteDao")
@Transactional
public class ClienteDaoImpl implements ClienteDAO {

  private HibernateTemplate hibernateTemplate;

  @Autowired
  public ClienteDaoImpl(SessionFactory sessionFactory) {
    hibernateTemplate = new HibernateTemplate(sessionFactory);
  }

  @Transactional(readOnly = false)
  public void save(Cliente cliente) {
    hibernateTemplate.saveOrUpdate(cliente);
  }

  @SuppressWarnings("unchecked")
  public List<Cliente> getAll() {
    return (List<Cliente>) hibernateTemplate.
        find("FROM " + Cliente.class.getName());
  }

  public Cliente selectbyEmail(String email) {
    return (Cliente) hibernateTemplate.
        find("FROM Cliente c WHERE c.email = ?", email);
  }

  @SuppressWarnings("unchecked")
  public List<Cliente> selectByNome(String nome) {
    return (List<Cliente>) hibernateTemplate.
        find("FROM Cliente c WHERE c.nome= ?", nome);
  }

  public Cliente selectById(String id) {
    return hibernateTemplate.get(Cliente.class, id);
  }

  @Transactional(readOnly = false)
  public void delete(Cliente cliente) {
    hibernateTemplate.delete(cliente);
  }

}