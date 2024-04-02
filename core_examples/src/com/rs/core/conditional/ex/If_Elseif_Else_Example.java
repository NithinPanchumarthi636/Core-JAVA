package com.rs.core.conditional.ex;

public class If_Elseif_Else_Example {

	public static void main(String[] args) {

		System.out.println("Start");

		int marks = 550;

		String grade = null;

		if (marks >= 570) {
			grade = "A+";
		} else if (marks >= 540) {
			grade = "A";
		} else if (marks >= 480) {
			grade = "B+";
		} else if (marks >= 420) {
			grade = "B";
		} else if (marks >= 360) {
			grade = "C+";
		} else if (marks >= 300) {
			grade = "C";
		} else {
			grade = "No Grade";
		}
		System.out.println(grade);

		System.out.println("End");

	}

}
