package challenges;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AliceAndBob {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		int alice = 0;
		int bob = 0;
		
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i)>b.get(i)) {
				bob++;
			} else if (a.get(i)<b.get(i)) {
				alice++;
			}
		}
		return Arrays.asList(alice,bob);
    }

	public static void main(String[] args) {
		
	
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Size: ");
//		int size = scanner.nextInt();
//		
//		int[] alice = new int[size];
//		int[] bob = new int[size];
//		
//		boolean full = true;
//		
//		int[] result = {0,0};
//		
//		System.out.print("For Alice: ");
//		for (int i = 0; i < size; i++) {
//			alice[i] = scanner.nextInt();
//		}
//		
//		System.out.print("For Bob: ");
//		for (int i = 0; i < size; i++) {
//			bob[i] = scanner.nextInt();
//		}
//		
//		while (full) {
//			for (int i = 0; i < 3; i++) {
//				if (alice[i] > bob[i]) {
//					System.out.println("Alice is awarded 1 point");
//					 result[0]++;
//				} else if (alice[i] < bob[i]) {
//					System.out.println("Bob is awarded 1 point");
//					result[1]++;
//				} else {
//					System.out.println("Neither person receives a point");
//				}
//			}
//			full = false;
//			for (int i : result) {
//				System.out.print(i + " ");
//			}
//		}
		
		
	}
	
	
}
