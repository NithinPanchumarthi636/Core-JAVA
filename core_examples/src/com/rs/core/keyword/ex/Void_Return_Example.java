package com.rs.core.keyword.ex;

public class Void_Return_Example {

	// caller/calling method
	public static void main(String[] args) {

		float grossSalary = 2400000;

		float netSalary = getNetSalary(grossSalary);

		printnetSalary(netSalary);
	}

	// called method
	public static float getNetSalary(float grossSalary) {
		return grossSalary / 12;
	}

	public static void printnetSalary(float netSalary) {
	  System.out.println(netSalary);
	}
}
