package core_examples;

public class Swap1 {

	public static void main(String[] args) {

		 int x = 5;
		 int y = 10;
		 
		 System.out.println("Before swapping: x = " + x + ", y = " + y);

	        // Swap the numbers without using a temporary variable
	        x = x + y;
	        y = x - y;
	        x = x - y;

	        System.out.println("After swapping: x = " + x + ", y = " + y);
	    
	}

}
