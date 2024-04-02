package com.rs.core.collections.setex;

import java.util.HashSet;

public class LinkedHashSetExample2 {
	public static void main(String[] args) {

		// Create a HashSet object called fruits
		HashSet<String> cities = new HashSet<String>();

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
