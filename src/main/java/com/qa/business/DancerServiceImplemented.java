package com.qa.business;

import javax.inject.Inject;

import com.qa.persistence.repository.DancerRepository;

public class DancerServiceImplemented implements DancerService {


	@Inject
	DancerRepository dancerRepository;
	
	public String getAllDancers() {
		return dancerRepository.getAllDancers();
	}


	public String getADacner(int id) {
		return dancerRepository.getADacner(id);
	}


	public String addADancer(String dancer) {
		return dancerRepository.addADancer(dancer);
	}


	public String deleteADancer(int id) {
		return dancerRepository.deleteADancer(id);
	}


	public String updateDancerDetails(int id, String dancer) {
		return dancerRepository.updateDancerDetails(id, dancer);
	}

}
