package com.qa.persistence.repository;

public interface DancerRepository {

	String getAllDancers();

	String getADacner(int id);

	String addADancer(String dancer);

	String deleteADancer(int id);

	String updateDancerDetails(int id, String dancer);

}
