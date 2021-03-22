package challenges;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s = s.trim();
        String delimiter = "[!,?._'@\\s]+";
        String[] tokens = s.split(delimiter);
        
        if (s.length() > 0) {
        	
			System.out.println(tokens.length);
			for (String token : tokens) {
				System.out.println(token);
			}
        } else {
			System.out.println(0);
		}
        
        scan.close();
		
	}
	
}
