package com.rs.core.string;

public class StringExample2 {

	public static void main(String[] args) {

		String fullname = " ";
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname = fullname + "Nithin ";
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname += "kumar ";
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname = fullname.concat("Panchumarthi");
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname = fullname.trim();

		char character;
		for (int index = 0; index < fullname.length(); index++) {
			character = fullname.charAt(index);
			System.out.println(character);
		}

		boolean contains = fullname.contains("kumars");
		System.out.println("contains:" + contains);

		int indexOf = fullname.indexOf("nett");
		System.out.println("indexOf:" + indexOf);

		int lastIndexOf = fullname.lastIndexOf("nett");
		System.out.println("lastIndexOf:" + lastIndexOf);

		fullname = fullname.toLowerCase();
		System.out.println("toLowerCase:" + fullname);

		fullname = fullname.toUpperCase();
		System.out.println("toUpperCase:" + fullname);

		fullname = fullname.replace(" ", ",");
		System.out.println("replace:" + fullname);

		boolean startsWith = fullname.startsWith("nith");
		System.out.println("startsWith:" + startsWith);

		boolean endsWith = fullname.endsWith("THI");
		System.out.println("endsWith:" + endsWith);

		String part1 = fullname.substring(0, 14);
		System.out.println("part1:" + part1);

		String part2 = fullname.substring(14);
		System.out.println("part2:" + part2);

		String[] fullnameArray = fullname.split(",");
		String name = "";
		for (int index = 0; index < fullnameArray.length; index++) {
			name = fullnameArray[index];
			System.out.println(name);
		}

	}

}
