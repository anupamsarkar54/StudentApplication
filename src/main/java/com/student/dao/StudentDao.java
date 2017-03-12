package com.student.dao;

import com.student.model.Student;

public interface StudentDao {
	
	public String addStudent(Student std);
	public Student getStudent(int Id);

}
