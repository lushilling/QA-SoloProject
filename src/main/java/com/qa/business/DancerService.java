package com.qa.business;

public interface DancerService {

	String getAllDancers();

	String getADancer(int id);

	String addADancer(String dancer);

	String deleteADancer(int id);

	String updateDancerDetails(int id, String dancer);

}
