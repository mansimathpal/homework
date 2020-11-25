package com.learning.dao;

import com.java.learning.model.Product;

public interface ProductDAO {

	public boolean saveProduct(Product product);
	
	public Product getProduct(int id);
	
	public boolean updateProduct(Product product);
	
	public boolean deleteProduct(Product product);
}
