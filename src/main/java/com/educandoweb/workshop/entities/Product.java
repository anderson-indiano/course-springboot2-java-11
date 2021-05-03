package com.educandoweb.workshop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_product")
@EqualsAndHashCode
public class Product implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	@Getter @Setter private String description;
	@Getter @Setter private Double price;
	@Getter @Setter private String imUrl;

	@Transient
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
