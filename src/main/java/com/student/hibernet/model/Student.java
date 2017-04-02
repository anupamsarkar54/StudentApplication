package com.student.hibernet.model;

import org.springframework.stereotype.Component;

@Component
public class Student {
private	String name;
private int age;
private int id;

public Student(){
	
}
public Student(String name,int age, int id){
	this.name = name;
	this.age = age;
	this.id = id;
	
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

}
