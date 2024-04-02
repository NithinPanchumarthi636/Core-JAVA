package com.rs.core.collections.setex;

import java.util.HashSet;

public class HashSetExample2 {
	public static void main(String[] args) {

		// Create a HashSet object called fruits
		HashSet<String> fruits = new HashSet<String>();

		// Add elements to the set
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add(null);

		// will not allow duplicates
		fruits.add("Apple");

		// Print the set
		System.out.println(fruits);
	}
}
