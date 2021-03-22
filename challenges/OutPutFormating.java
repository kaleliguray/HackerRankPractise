package challenges;

import java.util.Scanner;

public class OutPutFormating {

	public static void main(String[] args) {
		
		
		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("===========================");
//		for (int i = 0; i < 3; i++) {
//			String s = scanner.next();
//			int x = scanner.nextInt();
//			if (s.length()<=10) {
//				if (x>=0 && x<999) {
//					if (x % 100 == 2) {
//						System.out.printf("%-15s %d%n", s,x);
//					}else if (x%100 == 1) {
//						System.out.printf("%-15s %02d%n", s,x);
//					}else{
//						System.out.printf("%-15s  %03d%n", s,x);
//					}
//				}
//				
//			}
//			
//			
//		}
//		System.out.println("===========================");
		
		System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s=scanner.next();
            int x=scanner.nextInt();
            System.out.printf("%-15s%03d%n", s, x);
        }
        System.out.println("================================");
	
		
	}
	
	

}












































