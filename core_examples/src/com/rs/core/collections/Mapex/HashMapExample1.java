package com.rs.core.collections.Mapex;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String, Integer> people = new HashMap<String, Integer>();

		// add keys and values

		people.put("Nithin", 21);
		people.put("Nani", 23);
		people.put("Nile", 24);

		// print keys and values

		for (String i : people.keySet()) {

			System.out.println(" Name = " + i + " Age : " + people.get(i));

			// people.remove("Nithin");
			// System.out.println("updatedList:"+" Name = "+ i + " Age : " + people.get(i));

		}

	}

}
