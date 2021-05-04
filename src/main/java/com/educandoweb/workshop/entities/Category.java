package com.educandoweb.workshop.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "tb_category")
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"name", "products"})
public class Category implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	@Getter @Setter private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "categories")
	@Getter private Set<Product> products = new HashSet<>();
	
	public Category(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
