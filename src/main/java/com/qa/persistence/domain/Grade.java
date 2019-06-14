package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Grade {

	@Id
	private String gradeName;

	public Grade(String gradeName) {
		super();
		this.gradeName = gradeName;
	}

	public Grade() {
		
	}

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}
	
}
