package challenges;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Locale;

public class DateTime {

	public static void main(String[] args) {
		
		System.out.println(findDay(8, 5, 2015));
		
		System.out.println(findDay("08", "05", "2015"));
		
	}
	
	public static String findDay(int month,int day,int year) {
		
		Calendar calendar = Calendar.getInstance();
		
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DAY_OF_MONTH,day);
		calendar.set(Calendar.YEAR, year);
		
		return calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.ENGLISH).toUpperCase();
	}
	
	public static String findDay(String day, String month, String year) {
		
		int dd = Integer.parseInt(day);
		int mm = Integer.parseInt(month);
		int yy = Integer.parseInt(year);
		
		LocalDate date = LocalDate.of(yy, mm-1, dd);
		
		return date.getDayOfWeek().toString();
	}
	
}
