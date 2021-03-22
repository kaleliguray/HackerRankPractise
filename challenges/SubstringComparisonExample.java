package challenges;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubstringComparisonExample {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
        
        String smallest = s.substring(0, k);
        String largest = "";
        
        System.out.println(smallest);
        System.out.println(largest);
        for (int i = 0; i < s.length()-k+1; i++) {
			if (s.substring(i, i+k).compareTo(smallest) < 0) {
				smallest = s.substring(i, i+k);
			} 
			if (s.substring(i,i+k).compareTo(largest) > 0) {
				largest = s.substring(i,i+k);
			}
		}
        
        System.out.println(smallest);
        System.out.println(largest);
//        System.out.println(getSmallestAndLargest(s, k));
		
	}

	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";
		
		SortedSet<String> stringArray = new TreeSet<String>();
		
		for (int i = 0; i < s.length() - k; i++) {
			stringArray.add(s.substring(i, i+k));
			System.out.println(s.substring(i, i+k));
		}
		smallest = stringArray.first();
		largest = stringArray.last();
		
		return smallest + "\t" + largest;
	}
	
	
}
