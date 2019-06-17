package com.qa.persistence.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Teacher {

	@Id
	private String location;
	
	private String name;
	

//	@OneToMany(cascade = CascadeType.PERSIST ) //Fetch type . EAGER
//	@JoinColumn(name = "location")
//	Set<Dancer> dancerList = new HashSet<Dancer>();

	public Teacher(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public Teacher() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

}
