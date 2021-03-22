package challenges;

import java.util.Scanner;

public class AVeryBigSum {
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		long sum = 0;
		
		int n = scanner.nextInt();
		
		long[] ar = new long[n];
		
		for (int i = 1; i < ar.length; i++) {
			ar[i] += i; 
			System.out.println(ar[i]);
			sum += ar[i];
		}
		
		System.out.println(sum);
		
	}

}
