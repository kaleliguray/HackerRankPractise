package challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		List<ArrayList<Integer>> array = new ArrayList<>();
	
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		
		a1.add(1);
        a1.add(2);
        a1.add(3);

        a2.add(4);
        a2.add(5);
        a2.add(6);

        a3.add(7);
        a3.add(8);
        a3.add(10);
        
        array.add(a1);
        array.add(a2);
        array.add(a3);
        
        for (ArrayList obj : array) {
			ArrayList<Integer> temp = obj;
			for (Integer integer : temp) {
				System.out.print(integer);
			}
			System.out.println();
		}
        
        int left = 0;
        int right = 0;
        int n = array.size();
        
        for(int i = 0; i<n; i++){
            left += array.get(i).get(i);
            right += array.get(i).get(n-i-1);
        }
        
        int abs = Math.abs(left-right);
        
        System.out.println("Absolute : " + abs);
        
        
		
		
	}
	
}















