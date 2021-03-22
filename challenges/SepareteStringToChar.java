package challenges;

import java.util.Scanner;

public class SepareteStringToChar {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		String s[] = new String[t];
		
		for (int i = 0; i < t; i++) {
			s[i] = scanner.next();
		}
//		
//		for (String string2 : s) {
//			System.out.println(string2);
//		}
		
		for (int i = 0; i < 2; i++) {
			
			for (int j = 0; j < s[i].length(); j+=2) {
				
					System.out.print(s[i].charAt(j));
				
			}
			
			System.out.print(" ");
			
			for (int j = 1; j < s[i].length(); j+=2) {
				
					System.out.print(s[i].charAt(j));
				
			}
			System.out.println();
			
		}
		
		scanner.close();
	}
	
}


























