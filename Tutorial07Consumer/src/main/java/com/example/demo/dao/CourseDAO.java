package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourse(String id);
	List<CourseModel> selectAllCourses();
}
