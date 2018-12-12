import passwordErrors.*; 

public class PlacateITDepartment {
	public static void passwordCheck(String password) throws PasswordErrors {
		if (password.length() < 10) {
			throw new PasswordTooShort("That password is too short. It must be at least 10 characters.");
		}
		
		if (!password.matches("[0-9]{2}")) {
			throw new PasswordNeedsNumbers("Your password did not contain 2 numbers.");
		}
		
		if (!password.matches(".*[A-Z].*")) {
			throw new PasswordNeedsCapitals("Your password does not contain a capital letter. Please try again.");
		}
		
		if (!password.matches(".*[!@#$%^&*()-_+=].*")) {
			throw new PasswordNeedsSpecialCharacters("Your password does not contain any special characters. Please try again.");
		}
	}
}
