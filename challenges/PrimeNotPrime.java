package challenges;

import java.util.Scanner;

public class PrimeNotPrime {

	public static boolean isPrime(int num) {
		
		double numSqrt = Math.sqrt(num);
		
		if (num < 1) {
			return false;
		
		}else {
			for (int i = 2; i <= numSqrt; i++) {
				if (num % i == 0) {
					return false;
				}
			}
		}
		
		return true;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int value = scanner.nextInt();
		
		int[] numbers = new int[value];
		
		for (int i = 0; i < value; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < numbers.length; i++) {
			if (isPrime(numbers[i])) {
				System.out.println("Prime");
			}else {
				System.out.println("Not prime");
			}
		}
		
		
	}
	
}


























