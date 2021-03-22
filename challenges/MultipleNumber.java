package challenges;

import java.util.Scanner;

public class MultipleNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			int result = number * i;
			System.out.println(number + " x " + i + " = " + result);
		}
		
	}

}
























