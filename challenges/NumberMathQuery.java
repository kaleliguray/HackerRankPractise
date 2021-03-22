package challenges;

import java.util.Scanner;

public class NumberMathQuery {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		int s = 0;
		
		for (int i = 0; i < q; i++) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int n = scanner.nextInt();
			s = a;
			for (int j = 0; j < n; j++ ) {
				s += Math.pow(2, j) * b; 
				System.out.print(s + " ");
			}
			System.out.println();
		}

		
		
	}

	

}
