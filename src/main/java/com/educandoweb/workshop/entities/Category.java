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
@Table(name = "tb_category")
@EqualsAndHashCode
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	
	@Transient
	@Getter private Set<Product> products = new HashSet<>();
	
	public Category() {
		super();
	}
	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
