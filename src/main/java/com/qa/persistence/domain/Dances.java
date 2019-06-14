package com.qa.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Dances {
	
	@Id
	private String danceName;

	public Dances(String danceName) {
		super();
		this.danceName = danceName;
	}
	
	public Dances() {
		
	}

	public String getDanceName() {
		return danceName;
	}

	public void setDanceName(String danceName) {
		this.danceName = danceName;
	}
	
}
