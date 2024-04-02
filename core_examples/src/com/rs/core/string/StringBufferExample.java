package com.rs.core.string;

public class StringBufferExample {

	public static void main(String[] args) {

		StringBuffer fullname = new StringBuffer("");
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname.append("Nithin ");
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname.append("kumar ");
		System.out.println(fullname + ", " + fullname.hashCode());

		fullname.append("Panchumarthi");
		System.out.println(fullname + ", " + fullname.hashCode());

		char character;
		for (int index = 0; index < fullname.length(); index++) {
			character = fullname.charAt(index);
			System.out.println(character);
		}

		int indexOf = fullname.indexOf("in");
		System.out.println("indexOf:" + indexOf);

		int lastIndexOf = fullname.lastIndexOf("thi");
		System.out.println("lastIndexOf:" + lastIndexOf);

		String part1 = fullname.substring(0, 13);
		System.out.println("part1:" + part1);

		String part2 = fullname.substring(12);
		System.out.println("part2:" + part2);
		
		System.out.println(fullname);
		
		fullname.delete(1, 3);
		System.out.println(fullname);
		
		fullname.insert(1,"im");
		System.out.println(fullname);
		
		fullname.setCharAt(2, 't');
		System.out.println(fullname);
		
		
		fullname.reverse();
		System.out.println(fullname);

	}

}
