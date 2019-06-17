package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Dancer {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String email;
	private String ageGroup;
	private String gradeName;
	private String location;

	public Dancer(int id, String name, String email, String ageGroup, String gradeName, String location) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.ageGroup = ageGroup;
		this.gradeName = gradeName;
		this.location = location;
	}

	public Dancer() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAgeGroup() {
		return ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
