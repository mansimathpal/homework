package com.java.learning.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private int productPrice;
	private String prodictSupplier;
	
	public Product() { }

	public Product(int productId, String productName, int productPrice, String prodictSupplier) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.prodictSupplier = prodictSupplier;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	public String getProdictSupplier() {
		return prodictSupplier;
	}

	public void setProdictSupplier(String prodictSupplier) {
		this.prodictSupplier = prodictSupplier;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", prodictSupplier=" + prodictSupplier + "]";
	}
	
	
	
	
	
}
