package com.rs.core.string;

public class StringExample {

	public static void main(String[] args) {

		String s1 = "a";
		String s2 = "a";

		if (s1 == s2) {
			System.out.println("s1 == s2 :: == is to compare the two object hash references");
		}

		String s3 = new String("a");
		String s4 = new String("A");

		if (s3 == s4) {
			System.out.println("s3 == s4 :: == is to compare the two object hash references");
		}

		if (s3.equals(s4)) {

			System.out.println("s3.equals(s4):: .equals to compare the two object values which is case sensitive");
		}
		if (s3.equalsIgnoreCase(s4)) {

			System.out.println(
					"s3.equalsIgnoreCase(s4):: .equalsIgnoreCase to compare the two object values which is case Insensitive");
		}

	}

}
