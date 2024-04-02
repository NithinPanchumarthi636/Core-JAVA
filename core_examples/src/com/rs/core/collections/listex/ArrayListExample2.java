package com.rs.core.collections.listex;

import java.util.ArrayList;

public class ArrayListExample2 {
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo"); // Add an item
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars); // Print the ArrayList

		cars.set(0, "Opel"); // Change an item
		System.out.println(cars);

		cars.remove(0); // Remove an item
		System.out.println(cars);

		System.out.println(cars.size()); 
		for (int i = 0; i < cars.size(); i++) { // Loop through an ArrayList with a for loop
			System.out.println(cars.get(i));
		}

		for (String i : cars) { // Loop through an ArrayList with a for-each loop
			System.out.println(i);
		}
	}
}
