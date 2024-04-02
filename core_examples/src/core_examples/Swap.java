package core_examples;
public class Swap {

	  public static void main(String[] args) {
	    int x = 5;
	    int y = 10;
	    int temp;

	    System.out.println("Before swapping:");
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);

	    temp = x;
	    x = y;
	    y = temp;

	    System.out.println("After swapping:");
	    System.out.println("x = " + x);
	    System.out.println("y = " + y);
	
	}

}