package com.example.demo.dao;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "domgo_test")
public class EmpMongoDetailsDao {
@Id
private String id;
private String name;
private String city;
public EmpMongoDetailsDao(String id, String name, String city) {
	super();
	this.id = id;
	this.name = name;
	this.city = city;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

	
}
