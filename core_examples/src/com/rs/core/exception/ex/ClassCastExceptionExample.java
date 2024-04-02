package com.rs.core.exception.ex;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        
        Object incompatibleObject = "Hello, ClassCastException!";

      
        try {
           
            Integer result = (Integer) incompatibleObject;
            System.out.println("Result: " + result);
        } catch (ClassCastException e) {
            System.out.println("Oops! Unable to cast the object to the specified type.");
            System.out.println("Error Details: " + e.getMessage());
        }
    }
}
