package challenges;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class LibraryProblem {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Rented date : ");
		int day_returned = scanner.nextInt();
		int month_returned = scanner.nextInt();
		int year_returned = scanner.nextInt();
		
		System.out.println("Delivered date : ");
		int day_expected = scanner.nextInt();
		int month_expected = scanner.nextInt();
		int year_expected = scanner.nextInt();
		
		LocalDate date_returned = LocalDate.of(year_returned, month_returned, day_returned);
		LocalDate date_expected = LocalDate.of(year_expected, month_expected, day_expected);
		
		long fee = 0;
		long difference_day = 0;
		
		if (date_returned.isAfter(date_expected)) {
			
			if (date_expected.getYear() == date_returned.getYear()) {
				
				if (date_returned.getMonth() == date_expected.getMonth()) {
					
					difference_day = ChronoUnit.DAYS.between(date_expected, date_returned);
					
					fee = 15 * difference_day;
					
				}else {
					
					difference_day = ChronoUnit.MONTHS.between(date_expected, date_returned);
					
					fee = difference_day * 500;
					
				}
				
			}else {
				
				fee = 1000;
				
			}
			
		}
		
		System.out.println(fee);
		
	}
	
	
	
	
}



































