package com.rs.core.collections.setex;

import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {

		// Create a HashSet object called fruits
		TreeSet<String> cities = new TreeSet<String>();

		// Add elements to the set
		cities.add("NewYork");
		cities.add("Paris");
		cities.add("Hyderabad");

		// will not allow duplicates
		cities.add("NewYork");

		// Print the set
		System.out.println(cities);
	}
}
