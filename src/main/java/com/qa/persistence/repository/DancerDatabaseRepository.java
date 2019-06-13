package com.qa.persistence.repository;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Dancer;
import com.qa.utility.JSONUtil;

@Transactional(value = TxType.SUPPORTS)
public class DancerDatabaseRepository implements DancerRepository {

	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllDancers() {
		Query getAllQuery = manager.createQuery("Select d FROM Dancer d");
		Collection<Dancer> dancer = (Collection<Dancer>) getAllQuery.getResultList();
		return util.getJSONForObject(dancer);
	}

	public String getADacner(int id) {
		return util.getJSONForObject(manager.find(Dancer.class, id));
	}

	@Transactional(value = TxType.REQUIRED)
	public String addADancer(String dancer) {
		manager.persist(dancer);
		return dancer;
	}

	@Transactional(value = TxType.REQUIRED)
	public String deleteADancer(int id) {
		manager.remove(manager.find(Dancer.class, id));
		return util.returnMessage("Dancers details deleted");
	}

	@Transactional(value = TxType.REQUIRED)
	public String updateDancerDetails(int id, String dancer) {
		Dancer updatedDancer = util.getObjectForJSON(dancer, Dancer.class);
		Dancer oldDancer = manager.find(Dancer.class, id);
		oldDancer.setAgeGroup(updatedDancer.getAgeGroup());
		oldDancer.setEmail(updatedDancer.getEmail());
		oldDancer.setGradeName(updatedDancer.getGradeName());
		oldDancer.setLocation(updatedDancer.getLocation());
		oldDancer.setName(updatedDancer.getName());
		manager.persist(oldDancer);
		return util.returnMessage("Dancers details are updated");
	}

}
