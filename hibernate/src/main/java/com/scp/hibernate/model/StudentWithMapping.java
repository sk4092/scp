package com.scp.hibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_info3")
public class StudentWithMapping {
	
	@Id
	int id;
	
	@Column(name="student_Name",nullable = false)
	String name;

	
	
	public StudentWithMapping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentWithMapping(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "StudentWithMapping [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
