package com.qa.persistence.repository;

public interface TeacherRepository {
	
	String getAllTeachers();
	
	String getATeacher(int id);
	
	String addATeacher(String teacher);
	
	String deleteATeacher(int id);
	
	String updateTeacherDetails(int id, String teacher);

}
