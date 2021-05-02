package com.educandoweb.workshop.entities;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tb_order")
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"moment", "client"})
public class Order implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private Long id;
	
	@Getter @Setter private Instant moment;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	@Getter @Setter private User client;
}
