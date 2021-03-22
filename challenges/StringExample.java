package challenges;

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("A: ");
		String a = scanner.next();
		System.out.print("B: ");
		String b = scanner.next();
		
		System.out.println(a.length() + b.length());
		System.out.println(a.compareTo(b)>0 ? "Yes" : "No" );
		System.out.println(a.substring(0, 1).toUpperCase()+a.substring(1, a.length())
							+" "+b.substring(0, 1).toUpperCase()+b.substring(1, b.length()));
		
		
		
		
	}
	
}

























