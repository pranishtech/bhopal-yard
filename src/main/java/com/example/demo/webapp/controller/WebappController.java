package com.example.demo.webapp.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.example.demo.webapp.model.WebappModel;

@Controller

public class WebappController {

	@Autowired
	WebappModel webappModel;

	@GetMapping("/test")
	@ResponseBody
	public String getStatus() {
		return "OK";
	}

	@GetMapping("/getName")
	public String getName(String name, Model model) {

		// webappModel.setName("jn");
		// return webappModel.getName();
		model.addAttribute("name", name);
		return "hello";
	}
	@GetMapping("/nehealth")
	public void getNeighbourealth() throws URISyntaxException {
		String loc= new String("http://localhost:8080/health");
		//String loc= new String("https://www.alphavantage.co/query?=MYGSZIYRI64606GL");
		HttpHeaders header = new HttpHeaders();
		//header.setLocation(loc);
		
		RestTemplate restTemplate = new RestTemplate();
		
		HttpEntity<String> entity = new HttpEntity<String>(header);
	     
	    ResponseEntity<String> response = restTemplate.exchange(loc, HttpMethod.GET, entity, String.class);
		
		//new ResponseEntity<>("okay",header,HttpStatus.ACCEPTED);
		System.out.println(response);
	}
}
