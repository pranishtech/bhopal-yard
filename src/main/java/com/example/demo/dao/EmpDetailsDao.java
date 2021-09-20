package com.example.demo.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "EmpDetails")
public class EmpDetailsDao {
	
	
	private String name;
	@Id
	private String eid;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
