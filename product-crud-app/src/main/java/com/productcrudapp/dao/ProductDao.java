package com.productcrudapp.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.productcrudapp.model.Product;

@Component
public class ProductDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	// create product
	@Transactional
	public void createProduct(Product product) {
		this.hibernateTemplate.saveOrUpdate(product);
	}

	// get all products
	public List<Product> getAllProducts() {
		List<Product> allProducts = this.hibernateTemplate.loadAll(Product.class);
		return allProducts;
	}

	// delete product by id
	@Transactional
	public void deleteProduct(int productId) {
		Product product = this.hibernateTemplate.load(Product.class, productId);
		this.hibernateTemplate.delete(product);
	}

	// get product by id
	public Product getProductById(int productId) {
		Product product = this.hibernateTemplate.load(Product.class, productId);
		return product;
	}
}
