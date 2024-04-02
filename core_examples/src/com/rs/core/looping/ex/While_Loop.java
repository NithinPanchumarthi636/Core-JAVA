package com.rs.core.looping.ex;

public class While_Loop {

	public static void main(String[] args) {

		System.out.println("Start");

		int sum = 0;

		int index = 1;

		while (index <= 5) {

			sum = sum + index;

			index++;
		}

		System.out.println(sum);

		System.out.println("End");

	}

}
