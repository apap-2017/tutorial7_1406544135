package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CourseModel;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {

	@Autowired
	StudentService studentService;

	 @RequestMapping("/course/view/{id_course}")
	public CourseModel viewCourse(@PathVariable(value = "id_course") String id) {
		CourseModel course = studentService.selectCourse(id);
		return course;
	}

	@RequestMapping("/course/viewallcourses")
	public List<CourseModel> viewAllCourses() {
		List<CourseModel> courses = studentService.selectAllCourses();
		return courses;
	}

}
