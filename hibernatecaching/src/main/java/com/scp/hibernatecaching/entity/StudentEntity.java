package com.scp.hibernatecaching.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "Student_Info_5")
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class StudentEntity {

	@Id
	int id;

	@Column(name = "student_name")
	String name;

	float percentage;

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

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public StudentEntity(int id, String name, float percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

}
