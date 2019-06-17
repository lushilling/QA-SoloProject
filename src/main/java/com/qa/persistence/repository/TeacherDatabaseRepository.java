package com.qa.persistence.repository;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import com.qa.persistence.domain.Teacher;
import com.qa.utility.JSONUtil;

@Transactional(value = TxType.SUPPORTS)
public class TeacherDatabaseRepository implements TeacherRepository {

	@PersistenceContext(unitName = "myPU")
	private EntityManager manager;

	@Inject
	JSONUtil util;

	public String getAllTeachers() {
		Query getAllQuery = manager.createQuery("Select t FROM Teacher t");
		Collection<Teacher> teacher = (Collection<Teacher>) getAllQuery.getResultList();
		return util.getJSONForObject(teacher);
	}

	public String getATeacher(int id) {
		return util.getJSONForObject(manager.find(Teacher.class, id));
	}

	@Transactional(value = TxType.REQUIRED)
	public String addATeacher(String teacher) {
		manager.persist(teacher);
		return teacher;
	}

	@Transactional(value = TxType.REQUIRED)
	public String deleteATeacher(int id) {
		manager.remove(manager.find(Teacher.class, id));
		return util.returnMessage("Teachers details deleted");
	}

	@Transactional(value = TxType.REQUIRED)
	public String updateTeacherDetails(int id, String teacher) {
		Teacher updatedTeacher = util.getObjectForJSON(teacher, Teacher.class);
		Teacher oldTeacher = manager.find(Teacher.class, id);
		oldTeacher.setLocation(updatedTeacher.getLocation());
		oldTeacher.setName(updatedTeacher.getName());
		manager.persist(oldTeacher);
		return util.returnMessage("Teachers details updated");
	}

}
