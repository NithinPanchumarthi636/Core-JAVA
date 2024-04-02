package com.rs.core.collections.listex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
     // 1.
	List <String> southStates = new ArrayList<>();
	System.out.println(southStates.size()+","+southStates.isEmpty());
	
	southStates.add("AP");
	System.out.println(southStates.size()+","+southStates.isEmpty());
	southStates.add("TS");
	southStates.add( 1,"TN");
	southStates.add("KA");
	southStates.add("KL");
	southStates.add("AP");
	//southStates.add(null);
	
	//2.
	List<String> northStates = new ArrayList<>();
	
	northStates.add("DL");
	northStates.add("MP");
	northStates.add("UP");
	northStates.add("HP");
	northStates.add("WB");
	northStates.add("MH");
	
	//3.
	List<String> indiaStates = new ArrayList<>();
	
	indiaStates.addAll(northStates);
	indiaStates.addAll(0,southStates);
	
	// To sort
	
	Collections.sort(indiaStates);
	
	//4.Get the elements from the collection objects
	
	ListIterator<String> listIterator = indiaStates.listIterator();
	
	String element =null;
	
	System.out.println("Iterate the elements in the Forward direction");
	while (listIterator.hasNext()) {
		element =  listIterator.next();
		
		System.out.println(element);
		
	}
	
	System.out.println("Iterate the elements in the Backward direction");
	while (listIterator.hasPrevious()) {
		element =  listIterator.previous();
		
		System.out.println(element);
	}
	//5.
	boolean contains = indiaStates.contains("ap");
	System.out.println("contains:" + contains);
	
	indiaStates.set(1, "GR");
	
	boolean containsAll = indiaStates.containsAll(northStates);
	System.out.println("containsAll:" + containsAll);
	
	int indexOf = indiaStates.indexOf("AP");
	System.out.println("indexOf:"+ indexOf);
	
	int lastIndexOf = indiaStates.lastIndexOf("AP");
	System.out.println("lastIndexOF:"+ lastIndexOf);
	
	System.out.println(indiaStates);
	indiaStates.remove("UP");
	System.out.println(indiaStates);
	
	indiaStates.removeAll(southStates);
	System.out.println(indiaStates);
	
	indiaStates.clear();
	System.out.println(indiaStates);
	
	
	
	
	
	
	}

	}

