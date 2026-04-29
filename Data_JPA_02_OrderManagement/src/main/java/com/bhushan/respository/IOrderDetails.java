package com.bhushan.respository;

import org.springframework.data.repository.CrudRepository;

import com.bhushan.entity.FoodOrder;

public interface IOrderDetails extends CrudRepository<FoodOrder, Long> {
}
