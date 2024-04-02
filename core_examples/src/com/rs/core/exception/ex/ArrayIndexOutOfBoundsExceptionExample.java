package com.rs.core.exception.ex;

public class ArrayIndexOutOfBoundsExceptionExample {
		    public static void main(String[] args) {
		        
		        int[] numbers = {1, 2, 3, 4, 5};

		       
		        try {
		          
		            int result = numbers[10];
		            System.out.println("Result: " + result);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Oops! Unable to access an element at the specified index.");
		            System.out.println("Error Details: " + e.getMessage());
		        }
		    }
		}

}

}
