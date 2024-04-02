package com.rs.core.looping.ex;

public class Break_Example {

	public static void main(String[] args) {
		System.out.println("Start");

		int sum = 0;

		for (int index = 1; index <= 5; index++) {
			if (index == 4) {
				break;
			}

			sum = sum + index;
		}
		System.out.println(sum);

		System.out.println("End");
	}

}
