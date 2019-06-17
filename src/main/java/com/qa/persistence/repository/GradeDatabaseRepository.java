package com.qa.persistence.repository;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.qa.persistence.domain.Grade;
import com.qa.utility.JSONUtil;

public class GradeDatabaseRepository implements GradeRepository {

	@PersistenceContext(unitName = "myPU")
	EntityManager manager;

	@Inject
	private JSONUtil util;

	public String getAllGrades() {
		Query getAllQuery = manager.createQuery("Select g FROM Grade g");
		Collection<Grade> grade = (Collection<Grade>) getAllQuery.getResultList();
		return util.getJSONForObject(grade);
	}

	public String getAGrade(String gradeName) {
		return util.getJSONForObject(gradeName);
	}

}
