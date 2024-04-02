package com.rs.core.exception.ex;

public class Throw {
	
	static void check(int a)
	{
		if(a<18)
		{
			throw new ArithmeticException("not eligible");
		}
		else
			System.out.println("eligible");
		
	}
	

	public static void main(String[] args) {
		
		check(12);
		System.out.println("Heloo");

	}

}
