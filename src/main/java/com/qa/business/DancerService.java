package com.qa.business;

public interface DancerService {

	String getAllDancers();

	String getADacner(int id);

	String addADancer(String dancer);

	String deleteADancer(int id);

	String updateDancerDetails(int id, String dancer);

}
