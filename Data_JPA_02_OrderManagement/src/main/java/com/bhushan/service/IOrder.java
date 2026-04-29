package com.bhushan.service;

import java.util.Optional;

import com.bhushan.entity.FoodOrder;

public interface IOrder {

	void save(FoodOrder order);
    void saveAll(Iterable<FoodOrder> orders);

    
    Optional<FoodOrder> findById(Long id);
    Iterable<FoodOrder> findAll();
    Iterable<FoodOrder> findAllById(Iterable<Long> ids);
    boolean existsById(Long id);
    long count();

    
    void deleteById(Long id);
    void delete(FoodOrder order);
    void deleteAllById(Iterable<Long> ids);
    void deleteAll(Iterable<? extends FoodOrder> orders);
    void deleteAll();
}
