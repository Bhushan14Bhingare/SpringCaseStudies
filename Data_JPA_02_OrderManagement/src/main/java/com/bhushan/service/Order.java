package com.bhushan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.entity.FoodOrder;
import com.bhushan.respository.IOrderDetails;

@Service
public class Order implements IOrder {

	@Autowired
	private IOrderDetails repository;
	
	@Override
	public void save(FoodOrder order) {
		repository.save(order);
	}

	@Override
	public void saveAll(Iterable<FoodOrder> orders) {
		
		repository.saveAll(orders);
	}

	@Override
	public Optional<FoodOrder> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Iterable<FoodOrder> findAll() {		
		return repository.findAll();
	}

	@Override
	public Iterable<FoodOrder> findAllById(Iterable<Long> ids) {
		 return repository.findAllById(ids);
	}

	@Override
	public boolean existsById(Long id) {
		return repository.existsById(id);
	}

	@Override
	public long count() {
		return repository.count();
	}

	@Override
	public void deleteById(Long id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(FoodOrder order) {
		repository.delete(order);
	}

	@Override
	public void deleteAllById(Iterable<Long> ids) {
	    repository.deleteAllById(ids);
	}

	@Override
	public void deleteAll(Iterable<? extends FoodOrder> orders) {
		repository.deleteAll(orders);

	}

	@Override
	public void deleteAll() {
		repository.deleteAll();
	}

	
	
}

