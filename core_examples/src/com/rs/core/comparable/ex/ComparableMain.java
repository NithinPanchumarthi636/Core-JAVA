package com.rs.core.comparable.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {
   
		// create student list objects
		List<Student> students = new ArrayList<>();
		
		// add 7 student elements to student object
			
		students.add(new Student(5, "Ravi" ,90));	
		students.add(new Student(3, "Nithin" ,65));	
		students.add(new Student(6, "Sanjay" ,53));	
		students.add(new Student(2, "Sai" ,40));	
		students.add(new Student(7, "Neelima" ,50));	
		students.add(new Student(1, "Pranitha" ,60));	
		students.add(new Student(4, "Sowjanya", 70));
		
		Collections.sort(students);
		// iterate each student element and display in the console view
		
		Iterator<Student> iterator = students.iterator();
		
		Student student = null;
		while(iterator.hasNext()) {
			student = iterator.next();
			
			System.out.println(student.getId() + " ,"+ student.getName() + " and " + student.getMarks());
			
		}
	}

}
