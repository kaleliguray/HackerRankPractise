package challenges;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayı : ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n*i));
		}
		
	}
	
	
}



























