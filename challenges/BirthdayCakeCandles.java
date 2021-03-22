package challenges;

import java.util.*;


public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many candles do you have? ");
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}

		scanner.close();
		
		Arrays.sort(arr);
		
		int candles = 0, longest = arr[arr.length-1];
		
		for (int i = arr.length-1; i >= 0; i--) {
			if (longest == arr[i]) {
				candles++;
			} else {
				break;
			}
		}
		
		System.out.println(candles);
		
	}
	
	
	
	
}

















