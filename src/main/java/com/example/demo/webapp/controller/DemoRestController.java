package com.example.demo.webapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.CourseDao;
import com.example.demo.dao.EmpDetailsDao;
import com.example.demo.dao.EmpMongoDetailsDao;
import com.example.demo.repo.EmpCrudRepo;
import com.example.demo.repo.EmpMongoCrudRepo;
import com.example.demo.service.CourseService;

@RestController
public class DemoRestController {

	@Autowired
	CourseService courseService;
	@Autowired
	EmpCrudRepo empCrudRepo;
	@Autowired
	EmpMongoCrudRepo empMongoCrudRepo;
	@Autowired
	MongoTemplate mongotemplate;
	
	@GetMapping("/health")
	public String home() {
		System.out.println("hereeeee");
		return "success";
	}

	@GetMapping("/courses")
	public List<CourseDao> getCourses() {
		List<CourseDao> l = courseService.getCourses();
		return l;
	}

	@GetMapping("/courses/{courseId}")
	public String getCourses(@PathVariable("courseId") String courseId) {
		String l = courseService.getCourses(Integer.parseInt(courseId));
		return l;
	}

	@PostMapping(path ="/courses", consumes = "application/json")
	public CourseDao addCourse(@RequestBody CourseDao courserepo)
	{
		CourseDao l = courseService.addCourses(courserepo);
		return l;
		
	}
	
	@PostMapping(path ="/emp", consumes = "application/json")
	public String addCourse(@RequestBody EmpDetailsDao empDetailsDao)
	{
		empCrudRepo.save(empDetailsDao);
		return "OK";	
	}
	
	@PostMapping(path ="/empmongo", consumes = "application/json")
	public String addMongoCourse(@RequestBody EmpMongoDetailsDao empMongoDetailsDao)
	{
		mongotemplate.save(empMongoDetailsDao);
		return "OK";	
	}
	
	@GetMapping("/empmongo")
	public List<EmpMongoDetailsDao> getAllEmp()
	{
		List<EmpMongoDetailsDao> emdd=empMongoCrudRepo.findAll();
		return emdd;
		
	}
}
