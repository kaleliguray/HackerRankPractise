package challenges;

import java.util.Scanner;

public class Weird {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Number : ");
		int number = scanner.nextInt();
		
		if (number>=1 && number<=100){
			
			if (number % 2 == 1) {
				System.out.println("Weird");
			
			} if (number % 2 == 0) {
				
				if (number>=2 && number<=5) {
					System.out.println("Not Weird");
					
				}else if (number >= 6 && number<=20) {
					System.out.println("Weird");
				
				}else if (number>20) {
					System.out.println("Not Weird");
				}

			}
			
		}
		
		scanner.close();
		
		
	}
	
}



























