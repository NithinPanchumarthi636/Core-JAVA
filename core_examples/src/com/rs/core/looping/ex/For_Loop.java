package com.rs.core.looping.ex;

public class For_Loop {

	public static void main(String[] args) {
		System.out.println("Start");

		int sum = 0;

		for (int index = 1; index <= 5; index++) {

			sum = sum + index;
		}
		System.out.println(sum);

		System.out.println("End");
	}

}
