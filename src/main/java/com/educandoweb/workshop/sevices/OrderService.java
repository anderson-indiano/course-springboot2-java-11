package com.educandoweb.workshop.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.workshop.entities.Order;
import com.educandoweb.workshop.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository oderRepository;
	
	public List<Order> findAll() {
		return oderRepository.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = oderRepository.findById(id);
		return obj.get();
	}
}
