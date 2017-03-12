package com.student.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	DataSource datasource;
	JdbcTemplate jdbcTemplate;
	@Autowired
	public  StudentDaoImpl(DataSource datasource) {
		this.datasource = datasource;
		//jdbcTemplate = new JdbcTemplate(this.datasource);
	}
	
	
	@Override
	public String addStudent(Student std) {
		 	String sql = "insert into Student (name, age) values (?, ?)";
		 	jdbcTemplate = new JdbcTemplate(this.datasource);
		 	int result = jdbcTemplate.update(sql, std.getName(),12);
		 
		    System.out.println("Created Record Name = " + std.getName() + " Age = " + result);
		return "success";
	}

	@Override
	public Student getStudent(int id) {
		String sql = "Select * from Student where id=?";
	 	jdbcTemplate = new JdbcTemplate(this.datasource);
	 	Student student = jdbcTemplate.queryForObject(sql, new Object[]{id},new StudentMapper());
		return student;
	}

}
