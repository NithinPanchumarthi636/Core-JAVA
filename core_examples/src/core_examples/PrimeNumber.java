package core_examples;

public class PrimeNumber {
	public static void main(String[] args) {
		int number = 57;
		boolean isPrime = checkPrime(number);

		if (isPrime)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
	}

	public static boolean checkPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <=n/2; i++) {
			if (n % i == 0)
				return false;
		}

		return true;
	}
}
