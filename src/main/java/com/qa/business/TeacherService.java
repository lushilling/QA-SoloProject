package com.qa.business;

public interface TeacherService {

	String getAllTeachers();
	
	String getATeacher(int id);
	
	String addATeacher(String teacher);
	
	String deleteATeacher(int id);
	
	String updateTeacherDetails(int id, String teacher);
}
