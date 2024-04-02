package com.rs.core.exception.ex

public class ArrayStoreExceptionExample {
    public static void main(String[] args) {
       
        Object[] objects = new Integer[5];

        
        try {
           
            objects[0] = "Hello, ArrayStoreException!";
        } catch (ArrayStoreException e) {
            System.out.println("Oops! Unable to store a non-compatible type in the array.");
            System.out.println("Error Details: " + e.getMessage());
        }
    }
}

