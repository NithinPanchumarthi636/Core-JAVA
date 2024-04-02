package com.rs.core.collections.Mapex;

import java.util.LinkedHashMap;

public class LinkedHashMapExample2 {

	public static void main(String[] args) {
		LinkedHashMap<String, Integer> people = new LinkedHashMap<String, Integer>();

		// add keys and values

		people.put("Nithin", 21);
		people.put("Nani", 23);
		people.put(null, null);

		// print keys and values

		for (String i : people.keySet()) {

			System.out.println(" Name = " + i + " Age : " + people.get(i));

			// people.remove("Nithin");
			// System.out.println("updatedList:"+" Name = "+ i + " Age : " + people.get(i));

		}

	}

}
