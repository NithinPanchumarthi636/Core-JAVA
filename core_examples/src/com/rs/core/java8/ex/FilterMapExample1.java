package com.rs.core.java8.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//list of Person objects and we want to filter out the persons who are adults (age >= 18),
//then map their names to uppercase, and finally collect them into a list.

class Person{
	 private String name;
	 private int age;
	 
	 public Person(String name,int age) {
	 this.age =age;
	 this.name= name;
	 }
	 public String getName() {
		return name;
	}
	 public int getAge() {
		return age;
	}
}

public class FilterMapExample1 {

	public static void main(String[] args) {
		
		List<Person>persons =Arrays.asList(
				new Person("Nithin",24),
				new Person("Sai",17),
				new Person("Sanjay",18),
				new Person("Sunny",20),
				new Person("Nani",19)
				);
		
		  Stream<Object>result =persons.stream().filter(person ->person.getAge()>=18)
		  .map(person -> person.getName().toUpperCase()); //
		  //.collect(Collectors.toList());
		  //.System.out.println("Names od Adult(uppercase): " + result);
		  result.forEach(n->System.out.println(n));
		 
	}

}
