package com.rs.core.collections.listex;

import java.util.LinkedList;

public class LinkedListExample2 {
	public static void main(String[] args) {
		LinkedList<String> cars = new LinkedList<String>();

		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		System.out.println(cars);

		cars.set(0, "Opel");
		System.out.println(cars);

		cars.remove(0);
		System.out.println(cars);

		System.out.println(cars.size());
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}

		for (String i : cars) {
			System.out.println(i);
		}
	}
}
