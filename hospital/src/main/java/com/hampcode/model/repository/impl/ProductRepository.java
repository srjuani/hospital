package com.hampcode.model.repository.impl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.hampcode.model.entity.Product;
import com.hampcode.model.repository.IProductRepository;

@Named
public class ProductRepository implements IProductRepository, Serializable {

	private static final long serialVersionUID = -4384605411069305627L;
	
	@PersistenceContext(unitName = "tallerPU")
	private EntityManager em;
	
	@Override
	public Long insert(Product entity) throws Exception {
		// TODO Auto-generated method stub
		em.persist(entity);
		return entity.getId();
	}

	@Override
	public Long update(Product entity) throws Exception {
		em.merge(entity);
		return entity.getId();
	}

	@Override
	public List<Product> findAll() throws Exception {
		List<Product> products = new ArrayList<>();
		
//		TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p", Product.class);
//		TypedQuery<Product> query = em.createQuery("SELECT p.name, p.unitPrice FROM Product p", Product.class);
		TypedQuery<Product> query = em.createQuery("FROM Product p", Product.class);
		products = query.getResultList();
		
		return products;
	}

	@Override
	public Optional<Product> findById(Product entity) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
