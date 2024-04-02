package com.rs.core.looping.ex;

public class Do_While_Loop {

	public static void main(String[] args) {

		System.out.println("Start");

		int sum = 0;

		int index = 1;

		do {

			sum = sum + index;
			index++;
		} while (index <= 5);
		
		System.out.println(sum);

		System.out.println("End");

	}

}
