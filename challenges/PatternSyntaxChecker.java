package challenges;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int testCase = Integer.parseInt(scanner.nextLine());
		while(testCase>0) {
			String pattern = scanner.nextLine();
			try {
				Pattern.compile(pattern);
				System.out.println("Valid");
			} catch (Exception e) {
				System.out.println("Invalid");
			}
			testCase--;
		}
		
		
	}
	
	
}



























