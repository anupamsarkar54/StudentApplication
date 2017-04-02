package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.student.dao.StudentDao;
import com.student.hibernet.model.Student;



@RestController
public class WelComeController {
	
	@Autowired
	StudentDao dao;
	
	@RequestMapping(value="/*",method = RequestMethod.GET)
	public ModelAndView hellowStudent(){
	
		String message = "Hellow Student!!!!";
		return new ModelAndView("welcome","message",message);
		
	}
	
	@RequestMapping(value="/getStudent",method = RequestMethod.GET)
	public ModelAndView getStudent(){
	
		Student student = dao.getStudent(1);
		String message = "Hellow !!!!" + student.getName();
		return new ModelAndView("welcome","message",message);
		
	}
	
	@RequestMapping(value="/getAllStudent",method = RequestMethod.GET)
	public @ResponseBody ModelAndView getAllStudent(){
	
		List<Student> studentList = dao.getAllStudent();
//		String message = "Hellow !!!!" + student.getName();
//		return new ModelAndView("welcome","message",message);
		//return populateDummyUsers();
		return new ModelAndView("success","studentList",studentList);
		
	}
	
	private  List<Student> populateDummyUsers(){
		List<Student> users = new ArrayList<Student>();
		users.add(new Student("Sam",30, 70000));
		users.add(new Student("Tom",40, 50000));
		users.add(new Student("Jerome",45, 30000));
		users.add(new Student("Silvia",50, 40000));
		return users;
	}

}
