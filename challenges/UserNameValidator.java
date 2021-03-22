package challenges;

import java.util.Scanner;

class UserNameValidator {
	
	public static final String regularExpression = "[a-zA-Z](\\w){7,29}";
	
	private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UserNameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
	
}
