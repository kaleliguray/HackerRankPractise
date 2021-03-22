package challenges;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerProbablyPrime {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String number = scanner.nextLine();
		BigInteger isPrime = new BigInteger(number);
		
		try {
			
			if (isPrime.isProbablePrime(1)) {
				System.out.println("prime");
			}else {
				System.out.println("not prime");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try {
//			System.out.println("Number : ");
//			BigInteger num = scanner.nextBigInteger();
//			System.out.println(num.isProbablePrime(100) ? "prime" : "not prime");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		scanner.close();
	}
	
}
