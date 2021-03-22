package challenges;

import java.util.Scanner;

public class RegexIPAdress {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (scanner.hasNext()) {
			String IP = scanner.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		
	}
	
}


/*
     [01]?\\d{1,2}   matches numbers 0-199
     2[0-4]\\d       matches numbers 200-249
     25[0-5]         matches numbers 250-255
 */

class MyRegex{
	
	
	String number = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	
	String pattern = number + "." + number + "." + number + "." + number;
	
	
}








