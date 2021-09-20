package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.CourseDao;

@Service
public class CourseServiceImpl implements CourseService {

	List<CourseDao> cr = new ArrayList<CourseDao>();

	public CourseServiceImpl() {

		cr.add(new CourseDao("Math", 1));
		cr.add(new CourseDao("Sci", 2));
	}

	@Override
	public List<CourseDao> getCourses() {

		return cr;
	}

	@Override
	public String getCourses(int courseId) {
		for (CourseDao srr : cr) {
			if(srr.getId()==courseId)
				return srr.getName();
		}
		return null;
	}

	@Override
	public CourseDao addCourses(CourseDao courseRepo) {
		cr.add(courseRepo);
		return courseRepo;
	}

}
