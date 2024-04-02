package com.rs.core.java8.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMapExample {

	public static void main(String[] args) {
		List<Integer>numbers =Arrays.asList(1,2,3,4,5,6,7,8,9);
		List<Integer>results =numbers.stream().filter(num -> num%2 !=0).map(num ->num *2)
				.collect(Collectors.toList());
		System.out.println("filtered numbers:"+ results);
	}

}
