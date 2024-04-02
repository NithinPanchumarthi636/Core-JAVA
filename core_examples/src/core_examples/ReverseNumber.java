package core_examples;

public class ReverseNumber {
	public static void main(String[] args) {
			int number = 1234, reversedNum = 0,remainder;
			int orginalNum = number;
			while (number != 0) {
				remainder = number % 10;
				reversedNum = reversedNum * 10 + remainder;
				number = number / 10;
			}
			System.out.println("The reverse of the given number is: " + reversedNum);
	}
}
