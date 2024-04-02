package com.rs.core.collections.Mapex;

import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		TreeMap<String, Integer> people = new TreeMap<String, Integer>();

		// add keys and values

		people.put("Nithin", 21);
		people.put("Nani", 23);
		people.put("Nile", null);

		// print keys and values

		for (String i : people.keySet()) {

			System.out.println(" Name = " + i + " Age : " + people.get(i));

			// people.remove("Nithin");
			// System.out.println("updatedList:"+" Name = "+ i + " Age : " + people.get(i));

		}

	}

}
