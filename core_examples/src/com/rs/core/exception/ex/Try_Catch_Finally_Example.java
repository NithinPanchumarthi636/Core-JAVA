package com.rs.core.exception.ex;

public class Try_Catch_Finally_Example {

	public static void main(String[] args) {
		System.out.println("start");

		int totalMarks = 540;

		int numberOfSubjects = 0;

		float averageMarks = 0;
		boolean isExceptionPresent = false;

		try {
			averageMarks = totalMarks / numberOfSubjects;
		} catch (ArithmeticException ae) {
			isExceptionPresent = true;
		} finally {
			System.out.println("Please wait fpr results to be fetched");
		}
		if (isExceptionPresent) {
			System.out.println("Service has issue.Please try again after some time....");
		} else {
			System.out.println(averageMarks);
		}

		System.out.println("End");
	}

}
