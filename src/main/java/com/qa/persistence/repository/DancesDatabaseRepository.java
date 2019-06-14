package com.qa.persistence.repository;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.qa.persistence.domain.Dances;
import com.qa.utility.JSONUtil;

public class DancesDatabaseRepository implements DancesRepository {

	EntityManager manager;

	@Inject
	private JSONUtil util;


	public String getAllDances() {
		Query getAllQuery = manager.createQuery("Select d FROM Dances d");
		Collection<Dances> dances = (Collection<Dances>) getAllQuery.getResultList();
		return util.getJSONForObject(dances);
	}


	public String getADance(String danceName) {
		return util.getJSONForObject(danceName);
	}

}
