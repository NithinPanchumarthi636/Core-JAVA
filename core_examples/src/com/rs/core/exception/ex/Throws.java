package com.rs.core.exception.ex;

public class Throws {
	int div(int a, int b) throws ArithmeticException {
		int d = a / b;
		return d;

	}

	public static void main(String[] args) {

		Throws t = new Throws();
		try {
			System.out.println(t.div(10, 0));
		} catch (ArithmeticException e) {
			System.out.println("exception");
		}

	}

}
