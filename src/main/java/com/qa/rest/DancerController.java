package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.DancerService;

@Path("/dancer")
public class DancerController {
	
	@Inject
	DancerService dancerService;
	
	@GET
	@Path("/getAllDancers")
	@Produces({"application/json"})
	public String getAllDancers() {
		return dancerService.getAllDancers();
	};

	@GET
	@Path("/getADancer/{id}")
	@Produces({"application/json"})
	public String getADancer(@PathParam("id") int id) {
		return dancerService.getADancer(id);
	};
	
	@POST
	@Path("/addADancer")
	@Produces({"application/json"})
	public String addADancer(String dancer) {
		return dancerService.addADancer(dancer);
	};

	@DELETE
	@Path("/deleteADancer/{id}")
	public String deleteADancer(@PathParam("id") int id) {
		return dancerService.deleteADancer(id);
	};
	
	@PUT
	@Path("updateDancerDetails/{id}")
	@Produces({"application/json"})
	public String updateDancerDetails(@PathParam("id") int id, String dancer) {;
		return dancerService.updateDancerDetails(id, dancer);
	}
}
