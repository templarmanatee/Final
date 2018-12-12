import java.util.Scanner;
import passwordErrors.*; 

public class PasswordChecker {

	public static void main(String[] args) {
		int x = 0;
		
		do { 
			try {
				Scanner scan = new Scanner(System.in); 
				System.out.println("Please enter a password: ");
				String password = scan.next();
				PlacateITDepartment.passwordCheck(password);
				x = 1; 
			}
			catch(PasswordErrors e) {
				System.out.println(e.getMessage());
			}
		}
		while (x == 0);
	}

}
