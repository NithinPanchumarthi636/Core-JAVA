package com.rs.core.collections.Mapex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashExampleMap {

	public static void main(String[] args) {

		// 1.
		Map<String,String> southStates = new LinkedHashMap<>();
		System.out.println(southStates.size() + "," + southStates.isEmpty());

		southStates.put("AP", "Andhra");
		System.out.println(southStates.size() + "," + southStates.isEmpty());
		southStates.put("TS", "Telangana");
		southStates.put("TN", "Tamil Nadhu");
		southStates.put("KA", "Karnataka");
		southStates.put("KL", "Kerala");
		southStates.put("AP", "Andhra");
		southStates.put(null, null);

		// 2.
		Map<String, String> northStates = new LinkedHashMap<>();

		northStates.put("DL", "Delhi");
		northStates.put("MP", "Madhya Pradesh");
		northStates.put("UP", "Uttar Pradesh");
		northStates.put("HP", "Himachal Pradesh");
		northStates.put("WB", "West Bengal");
		northStates.put("MH", "Maharasthra");

		// 3.
		Map<String, String> indiaStates = new LinkedHashMap<>();

		indiaStates.putAll(northStates);
		indiaStates.putAll(southStates);

		// 4.Get the elents from the collection objects
		Set<String> keys = indiaStates.keySet();
		Iterator<String> iterator = keys.iterator();

		String key = null;
		String value = null;

		while (iterator.hasNext()) {
			key = iterator.next();
			value = indiaStates.get(key);

		}
		// 5.
		boolean contains = indiaStates.containsKey("AP");
		System.out.println("contains:" + contains);

		boolean containsAll = indiaStates.containsValue(northStates);
		System.out.println("containsAll:" + containsAll);

		System.out.println(indiaStates);
		indiaStates.remove("UP");
		System.out.println(indiaStates);

		indiaStates.clear();
		System.out.println(indiaStates);

	}

}
