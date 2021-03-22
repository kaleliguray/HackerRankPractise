package challenges;

import java.util.Scanner;

public class PersonAge {
	
	private int age;
	
	public PersonAge(int initialAge) {
		
		if (!(initialAge < 0)) {
			this.age = initialAge;
			
		} else {
			this.age = 0;
			System.out.println("Age is not valid,setting age to 0.");
		}
			
	}
	
	public void yearPasses() {
		this.age += 1;
	}
	
	public void amIOld() {
		if (this.age < 13) {
			System.out.println("You are young.");
		} else if (this.age >= 13 && this.age < 18) {
			System.out.println("You are a teenager.");
		}else {
			System.out.println("You are old.");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int t = scanner.nextInt();
		
		for(int i=0; i<t; i++) {
			int age = scanner.nextInt();
			PersonAge person = new PersonAge(age);
			person.amIOld();
			for (int j = 0; j < 3; j++) {
				person.yearPasses();
			}
			person.amIOld();
			System.out.println();
		}
		scanner.close();
	}

	
	
}
























