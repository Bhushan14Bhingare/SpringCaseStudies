package com.bhushan.repository;

import org.springframework.data.repository.CrudRepository;

import com.bhushan.entity.Travel;

public interface ITravelManagement extends CrudRepository<Travel, Integer> {

}
