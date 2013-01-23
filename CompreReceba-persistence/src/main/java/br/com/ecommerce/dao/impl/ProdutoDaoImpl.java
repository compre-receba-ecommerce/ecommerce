/*
 * ProdutoDaoImpl.java criado em 11/01/2013
 */
package br.com.ecommerce.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.ecommerce.dao.ProdutoDAO;
import br.com.ecommerce.entity.Produto;

/**
 * @author relfarias@gmail.com (Rejaine Farias)
 */
@Repository("produtoDao")
@Transactional
public class ProdutoDaoImpl implements ProdutoDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	@Transactional(readOnly = false)
	public void save(Produto produto) {
		hibernateTemplate.saveOrUpdate(produto);
	}

	@SuppressWarnings("unchecked")
	public List<Produto> getAll() {
		return (List<Produto>) hibernateTemplate.find("from "
				+ Produto.class.getName());
	}

	public Produto selectbyMarca(String marca) {
		return (Produto) hibernateTemplate.find(
				"FROM Produto p WHERE p.marca=?", marca);
	}

	@SuppressWarnings("unchecked")
	public List<Produto> selectByNome(String nome) {
		return (List<Produto>) hibernateTemplate.find(
				"from Produto p where p.nome=?", nome);
	}

	public Produto selectById(String id) {
		return hibernateTemplate.get(Produto.class, id);
	}

	@Transactional(readOnly = false)
	public void delete(Produto produto) {
		hibernateTemplate.delete(produto);
	}

}