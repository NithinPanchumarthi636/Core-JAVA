package com.rs.fer.core.constructor.ex;

public class Student {
	
	String name;
	int rollNumber;
	
	public Student(String name,int rollNumber) {
		this.name = name;
		this.rollNumber = rollNumber;
	}

	public static void main(String[] args) {
		
		Student student = new Student("Nithin",71);
		System.out.println("Student: " + student.name + " (" + student.rollNumber +	")");

	}

}
