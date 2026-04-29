package com.bhushan.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhushan.entity.Travel;
import com.bhushan.repository.ITravelManagement;
@Service("travel")
public class TravelService implements ITravelService {
	
	@Autowired
	private ITravelManagement travels;

	@Override
	public void addTravle(Travel travel) {
		travels.save(travel);
	}

	@Override
	public Iterable<Travel> getAllTravels() {
		
		return travels.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Integer id) {
		return travels.findById(id);
	}

}
