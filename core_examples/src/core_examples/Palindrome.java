package core_examples;

public class Palindrome {

	public static void main(String[] args) {

		int num = 3553, reversedNum = 0,remainder;
		int orginalNum = num;
		while (num != 0) {
			remainder = num % 10;
			reversedNum = reversedNum * 10 + remainder;
			num /= 10;
		}
		

		// check if reversedNum and originalNum are equal
		if (orginalNum == reversedNum) {
			System.out.println(num + " is Palindrome.");
		} else {
			System.out.println(num+ " is not Palindrome.");
		}
	}

}
