package com.rs.core.string;

public class PrintAlternateCharacters {

	public static void main(String[] args) {
		String input = "Hello World";
		printAlternateCharacters(input);
	}

	public static void printAlternateCharacters(String input) {
		for (int i = 0; i < input.length(); i += 2) {
			System.out.print(input.charAt(i));
		}
		System.out.println(); // New line after printing alternate characters
	}
}
