package com.bhushan.service;

import java.util.Optional;

import com.bhushan.entity.Travel;

public interface ITravelService {

	void addTravle(Travel travel);
	Iterable<Travel> getAllTravels();
	Optional<Travel> findTravelById(Integer id);
}
