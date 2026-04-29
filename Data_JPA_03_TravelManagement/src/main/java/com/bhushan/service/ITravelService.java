package com.bhushan.service;

import java.util.Optional;

import com.bhushan.entity.Travel;

public interface ITravelService {

	void addTravel(Travel travel);
	Iterable<Travel> retrieveAllTravels();
	Optional<Travel> findTravelById(Long id);
	void deleteTravelById(Long id);
    boolean checkIfTravelExists(Long id);
    long countTravels();
    void deleteTravelObject(Travel travel);
    void deleteAllTravel();
	
}
