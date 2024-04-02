package com.rs.core.collections.Mapex;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashtableExample {

	public static void main(String[] args) {

		// 1.
		Map<String, String> southStates = new Hashtable<>();
		System.out.println(southStates.size() + "," + southStates.isEmpty());

		southStates.put("AP", "Andhra");
		System.out.println(southStates.size() + "," + southStates.isEmpty());
		southStates.put("TS", "Telangana");
		southStates.put("TN", "Tamil Nadhu");
		southStates.put("KA", "Karnataka");
		southStates.put("KL", "Kerala");
		southStates.put("AP", "Andhra");
		southStates.put("", "");

		// 2.
		Map<String, String> northStates = new Hashtable<>();

		northStates.put("DL", "Delhi");
		northStates.put("MP", "Madhya Pradesh");
		northStates.put("UP", "Uttar Pradesh");
		northStates.put("HP", "Himachal Pradesh");
		northStates.put("WB", "West Bengal");
		northStates.put("MH", "Maharasthra");

		// 3.
		Map<String, String> indiaStates = new Hashtable<>();

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
			System.out.println(key + ":" + value);

		}
		// 5.
		boolean containsKey = indiaStates.containsKey("AP");
		System.out.println("containsKey:" + containsKey);

		boolean containsValue = indiaStates.containsValue("Andhra");
		System.out.println("containsValue:" + containsValue);

		System.out.println(indiaStates);
		indiaStates.remove("UP");
		System.out.println(indiaStates);

		indiaStates.clear();
		System.out.println(indiaStates);

	}

}
