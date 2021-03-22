package challenges;

import java.util.Scanner;

public class EndOfFile {
	
	public static void main(String[] args) {
		
		String line = "Hello world\n" + 
				"I am a file\n" + 
				"Read me until end-of-file.";
//		int i = 0;
		Scanner scanner = new Scanner(line);
		
		
//		while (scanner.hasNext()) {
//			scanner.useDelimiter("\n");
//			i++;
//			System.out.println(i+" "+scanner.next());
//		}
		
		for (int i = 1; scanner.hasNext() == true; i++) {
			System.out.println(i + " " + scanner.nextLine());
		}
		
		
	}

}















