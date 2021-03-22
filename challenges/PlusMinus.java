package challenges;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int sizeOfArray = scanner.nextInt();
		int[] ourArray = new int[sizeOfArray];
		
		int positiveCount = 0,negativeCount = 0,zeroCount = 0;
		
		for (int i = 0; i < sizeOfArray; i++) {
			ourArray[i] = scanner.nextInt();
			if (ourArray[i]<0) {
				negativeCount++;
			} else if (ourArray[i]>0) {
				positiveCount++;
			}else if (ourArray[i] == 0){
				zeroCount++;
			}
		}
		
		double neg = 0.0d;
		double post = 0.0d;
		double zero = 0.0d;
		
		post = (double)positiveCount/sizeOfArray;
		neg = (double)negativeCount/sizeOfArray;
		zero = (double)zeroCount/sizeOfArray;
		
		System.out.printf("%.6f \n", post);
		System.out.printf("%.6f \n", neg);
		System.out.printf("%.6f", zero);
		
		
	}
	
	
	
	
	
	
}





























