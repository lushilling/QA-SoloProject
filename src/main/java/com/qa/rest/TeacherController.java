package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.TeacherService;

@Path("/teacher")
public class TeacherController {
	
	@Inject
	TeacherService teacherService;

	@GET
	@Path("/getAllTeachers")
	@Produces({"application/json"})
	public String getAllTeacher() {
		return teacherService.getAllTeachers();
	};

	@GET
	@Path("/getATeacher/{id}")
	@Produces({"application/json"})
	public String getATeacher(@PathParam("id") int id) {
		return teacherService.getATeacher(id);
	};
	
	@POST
	@Path("/addATeacher")
	@Produces({"application/json"})
	public String addATeacher(String teacher) {
		return teacherService.addATeacher(teacher);
	};

	@DELETE
	@Path("/deleteATeacher/{id}")
	public String deleteATeacher(@PathParam("id") int id) {
		return teacherService.deleteATeacher(id);
	};
	
	@PUT
	@Path("updateTeacherDetails/{id}")
	@Produces({"application/json"})
	public String updateTeacherDetails(@PathParam("id") int id, String teacher) {;
		return teacherService.updateTeacherDetails(id, teacher);
	}
	
}
