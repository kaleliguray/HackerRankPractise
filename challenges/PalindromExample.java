package challenges;

import java.util.Scanner;

public class PalindromExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String a = scanner.next();
		
		StringBuilder palindrom = new StringBuilder(a);
		
		String revPalindrom = palindrom.reverse().toString();
		
		System.out.println(revPalindrom);
		
		if (a.equals(revPalindrom)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		scanner.close();
//		String palindrom = "";
//		int length = a.length();
//		
//		for (int i = length-1; i >= 0; i--) {
//			palindrom += a.charAt(i);
//		}
//		
//		if (a.equals(palindrom)) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}
		
	}
	
	
	
}






















