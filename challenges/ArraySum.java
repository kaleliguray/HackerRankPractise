package challenges;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] array = new int[n];
		int toplam = 0;
		
		for (int i = 1; i < array.length; i++) {
			array[i] = i;
			System.out.println(array[i]);
			toplam = toplam + array[i];
		}
		
		
		System.out.println("toplam : " + toplam);
		
	}
}
