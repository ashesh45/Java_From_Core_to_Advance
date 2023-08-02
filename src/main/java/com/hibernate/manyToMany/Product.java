package com.hibernate.manyToMany;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
	@Column(name="product_name")
	private String name;

	@Column(name="product_description")
	private String description;

	@Column(name="product_price")
	private float price;
	@ManyToMany
	List<Category> categories;
	
	public Product(int id, String name, String description, float price) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Product(String name, String description, float price) {
		super();
		this.name = name;
		this.description = description;
		this.price = price;
	}
	public Product() {
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", categories=" + categories + "]";
	}
	

}
