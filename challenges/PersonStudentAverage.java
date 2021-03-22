package challenges;

import java.util.Scanner;

class Person {

	protected String firstName;
	protected String lastName;
	protected int idNumber;

	public Person(String firstName, String lastName, int identification) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + " ID: " + idNumber);
	}

}

class Student extends Person {

	private int[] scores;
	int a = 0;

	public Student(String firstName, String lastName, int idNumber, int[] testScore) {
		super(firstName, lastName, idNumber);
		this.scores = testScore;
	}

	public String calculate() {
		int sum = 0;
		for (int i : this.scores) {
			sum += i;
		}
		double avg = sum / scores.length;
		if (avg <= 100 && avg >= 90) {
			return "O";
		} else if (avg < 90 && avg >= 80) {
			return "E";
		} else if (avg < 80 && avg >= 70) {
			return "A";
		} else if (avg < 70 && avg >= 55) {
			return "P";
		} else if (avg < 55 && avg >= 40) {
			return "D";
		} else {
			return "T";
		}
	}
}

public class PersonStudentAverage {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for (int i = 0; i < numScores; i++) {
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}

}
