package com.educandoweb.workshop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_product")
@EqualsAndHashCode(exclude = {"name", "description", "price", "imUrl", "categories"})
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	@Getter @Setter private String description;
	@Getter @Setter private Double price;
	@Getter @Setter private String imUrl;
	
	@ManyToMany
	@JoinTable(name = "tb_product_category", joinColumns = @JoinColumn(name = "product_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	@Getter private Set<Category> categories = new HashSet<>();

	public Product() {
		super();
	}

	public Product(Long id, String name, String description, Double price, String imUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imUrl = imUrl;
	}
}
