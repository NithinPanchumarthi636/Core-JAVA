package com.rs.core.comparable.ex;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private int marks;

	// Default constructor
	public Student() {

	}

	// parameterized constructor
	public Student(int id, String name, int marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	@Override
	public int compareTo(Student otherObject) {

		/*
		 * if (this.getId() > otherObject.getId()) { return 1; } else if (this.getId() <
		 * otherObject.getId()) { return -1; } else { return 0; }
		 */
		if (this.getMarks() > otherObject.getMarks()) {
			return 1;
		} else if (this.getMarks() < otherObject.getMarks()) {
			return -1;
		} else {
			return 0;
		}
	}

}
