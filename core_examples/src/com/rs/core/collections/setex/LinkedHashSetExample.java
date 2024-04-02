package com.rs.core.collections.setex;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {


		
		
	     // 1.
		Set <String> southStates = new LinkedHashSet<>();
		System.out.println(southStates.size()+","+southStates.isEmpty());
		
		southStates.add("AP");
		System.out.println(southStates.size()+","+southStates.isEmpty());
		southStates.add("TS");
		southStates.add("TN");
		southStates.add("KA");
		southStates.add("KL");
		southStates.add("AP");
		southStates.add(null);
		
		//2.
		Set<String> northStates = new LinkedHashSet<>();
		
		northStates.add("DL");
		northStates.add("MP");
		northStates.add("UP");
		northStates.add("HP");
		northStates.add("WB");
		northStates.add("MH");
		
		//3.
		Set<String> indiaStates = new LinkedHashSet<>();
		
		indiaStates.addAll(northStates);
		indiaStates.addAll(southStates);
		
		//4.Get the elents from the collection objects
		
		Iterator<String> iterator = indiaStates.iterator();
		
		String element =null;
		while (iterator.hasNext()) {
			element = (String) iterator.next();
			
			System.out.println(element);
			
		}
		//5.
		boolean contains = indiaStates.contains("ap");
		System.out.println("contains:" + contains);
		
		
		boolean containsAll = indiaStates.containsAll(northStates);
		System.out.println("containsAll:" + containsAll);
		
		
		System.out.println(indiaStates);
		indiaStates.remove("UP");
		System.out.println(indiaStates);
		
		indiaStates.removeAll(southStates);
		System.out.println(indiaStates);
		
		indiaStates.clear();
		System.out.println(indiaStates);
		
		
		
		
		
		
		}

}
