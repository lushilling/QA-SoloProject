package com.qa.business;

import com.qa.persistence.repository.TeacherRepository;

public class TeacherServiceImplmented implements TeacherService {

	TeacherRepository teacherRepository;

	public String getAllTeachers() {
		return teacherRepository.getAllTeachers();
	}


	public String getATeacher(int id) {
		return teacherRepository.getATeacher(id);
	}


	public String addATeacher(String teacher) {
		return teacherRepository.addATeacher(teacher);
	}


	public String deleteATeacher(int id) {
		return teacherRepository.deleteATeacher(id);
	}


	public String updateTeacherDetails(int id, String teacher) {
		return teacherRepository.updateTeacherDetails(id, teacher);
	}
	

}
