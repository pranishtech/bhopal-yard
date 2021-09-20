package com.example.demo.service;

import java.util.List;

import com.example.demo.dao.CourseDao;


public interface CourseService {

	public List<CourseDao> getCourses();

	public String getCourses(int courseId);

	public CourseDao addCourses(CourseDao courserepo);
}
