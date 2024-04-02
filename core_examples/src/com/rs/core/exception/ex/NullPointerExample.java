package com.rs.core.exception.ex

public class NullPointerExample {
    public static void main(String[] args) {
        
        String userName = null; 

        
        try {
            greetUser(userName);
        } catch (NullPointerException e) {
            System.out.println("Oops! Unable to greet the user due to an uninitialized user name.");
            System.out.println("Error Details: " + e.getMessage());
        }
    }

  
    private static void greetUser(String name) {
       
        System.out.println("Hello, " + name + "!");
    }
}
