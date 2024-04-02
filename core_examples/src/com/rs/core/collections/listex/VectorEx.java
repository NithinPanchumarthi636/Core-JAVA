package com.rs.core.collections.listex;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {

		// 1.
		List<String> southStates = new Vector<>();
		System.out.println(southStates.size() + "," + southStates.isEmpty());

		southStates.add("AP");
		System.out.println(southStates.size() + "," + southStates.isEmpty());
		southStates.add("TS");
		southStates.add(1, "TN");
		southStates.add("KA");
		southStates.add("KL");
		southStates.add("AP");
		southStates.add(null);

		// 2.
		List<String> northStates = new Vector<>();

		northStates.add("DL");
		northStates.add("MP");
		northStates.add("UP");
		northStates.add("HP");
		northStates.add("WB");
		northStates.add("MH");

		// 3.
		Vector<String> indiaStates = new Vector<>();

		indiaStates.addAll(northStates);
		indiaStates.addAll(0, southStates);

		// 4.Get the elements from the collection objects

		Enumeration<String> enumeration = indiaStates.elements();

		String element = null;
		while (enumeration.hasMoreElements()) {
			element = (String) enumeration.nextElement();

			System.out.println(element);

		}
		// 5.
		boolean contains = indiaStates.contains("ap");
		System.out.println("contains:" + contains);

		indiaStates.set(1, "GR");

		boolean containsAll = indiaStates.containsAll(northStates);
		System.out.println("containsAll:" + containsAll);

		int indexOf = indiaStates.indexOf("AP");
		System.out.println("indexOf:" + indexOf);

		int lastIndexOf = indiaStates.lastIndexOf("AP");
		System.out.println("lastIndexOF:" + lastIndexOf);

		System.out.println(indiaStates);
		indiaStates.remove("UP");
		System.out.println(indiaStates);

		indiaStates.removeAll(southStates);
		System.out.println(indiaStates);

		indiaStates.clear();
		System.out.println(indiaStates);

	}

}
