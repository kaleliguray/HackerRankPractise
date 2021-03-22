package challenges;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class FormatingNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();
			
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		
		Locale ındia = new Locale("en", "in");
		
		String india = NumberFormat.getCurrencyInstance(ındia).format(payment);
		
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
		
		System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
		
		
		
		
	}
	
}












