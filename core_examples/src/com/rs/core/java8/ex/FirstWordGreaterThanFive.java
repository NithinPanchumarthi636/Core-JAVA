package com.rs.core.java8.ex;
import java.util.Arrays;


public class FirstWordGreaterThanFive {
    public static void main(String[] args) {
        String str = "This is a sample string to find the first word with a length greater than 5";
        String[] words = str.split(" ");
        System.out.println("The first word in the string with a length greater than 5 is: " +
            Arrays.stream(words)
                .filter(word -> word.length() > 5)
                .findFirst()
                .get()
        );
    }
}