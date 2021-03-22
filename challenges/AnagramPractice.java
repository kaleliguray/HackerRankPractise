package challenges;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramPractice {
	
	static boolean isAnagram(String a, String b) {
		
		 char aa[] = a.toLowerCase().toCharArray();
	        char bb[] = b.toLowerCase().toCharArray();
	        if(a.length() != b.length()){
	            return false;
	        }else{
	            java.util.Arrays.sort(aa);
	            java.util.Arrays.sort(bb);
	            return java.util.Arrays.equals(aa, bb);
	        }
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("a: ");
//		a = scanner.next();
//		
//		System.out.print("b: ");
//		b = scanner.next();
//		
//		if( a == null || b == null || a.equals("") || b.equals("") ) {
//		    throw new IllegalArgumentException();
//		}
//		
//		
//		if (a.length() !=  b.length()) {
//			return false;
//		}
//		
//		a = a.toLowerCase();
//		b = b.toLowerCase();
//		
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		for (int i = 0; i < b.length(); i++) {
//			char letter = b.charAt(i);
//			
//			if (!map.containsKey(letter)) {
//				map.put(letter,1);
//			} else {
//				Integer frequency = map.get(letter);
//				map.put(letter, frequency++);
//			}
//			
//		}
//		
//		for (int i = 0; i < a.length(); i++) {
//			char letter = a.charAt(i);
//			
//			if (!map.containsKey(letter)) {
//				return false;
//			}
//			
//			Integer frequency = map.get(letter);
//			
//			if (frequency == 0) {
//				return false;
//			} else {
//				map.put(letter, --frequency);
//			}
//			
//		}
//		
//		
//		return true;
	}

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String b = scanner.next();
		String a = scanner.next();
		
		boolean anagram = false;
		anagram = isAnagram(a, b);
		if (anagram) {
			System.out.println("Yes Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
























