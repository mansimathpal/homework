package com.learning.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hibernate.learning.config.HibernateUtil;
import com.java.learning.model.Product;
import com.learning.dao.ProductDAO;

public class ProductDAOImpl implements ProductDAO {

	SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
	@Override
	public boolean saveProduct(Product product) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.save(product);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public Product getProduct(int id) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			Product product=session.get(Product.class, id);
			tx.commit();
			session.close();
			return product;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null ;
	}
	}
	@Override
	public boolean updateProduct(Product product) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.update(product);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	@Override
	public boolean deleteProduct(Product product) {
		try {
			Session session=sessionFactory.openSession();
			Transaction tx= session.beginTransaction();
			session.delete(product);
			tx.commit();
			session.close();
			return true;
		} catch (HibernateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}
	
	

}
