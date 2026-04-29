package com.bhushan.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bhushan.entity.Travel;
import com.bhushan.repository.ITravelRepository;
@Component
public class TravelService implements ITravelService {

	@Autowired
	private ITravelRepository repository;
	@Override
	public void addTravel(Travel travel) {
       repository.save(travel);
	}

	@Override
	public Iterable<Travel> retrieveAllTravels() {
		return repository.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(Long id) {
		return repository.findById(id);
	}

	@Override
	public void deleteTravelById(Long id) {
           repository.deleteById(id);
	}

	@Override
	public boolean checkIfTravelExists(Long id) {
		
		return repository.existsById(id);
	}

	@Override
	public long countTravels() {
		return repository.count();
	}

	@Override
	public void deleteTravelObject(Travel travel) {
		repository.delete(travel);
	}

	@Override
	public void deleteAllTravel() {
		repository.deleteAll();
	}

}
