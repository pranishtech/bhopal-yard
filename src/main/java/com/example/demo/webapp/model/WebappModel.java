package com.example.demo.webapp.model;

import org.springframework.stereotype.Component;

@Component
public class WebappModel {
private String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
