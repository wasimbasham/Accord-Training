package j13l2;

import java.io.Console;

public class LabThree {
	public static void main(String[] args) {
		Console console = System.console();
		if (console == null) {
			System.out.println("Console not available. Exiting...");
			System.exit(1);
		}

		String username = console.readLine("Enter username: ");
		char[] passwordArray = console.readPassword("Enter password: ");
		String password = new String(passwordArray);

		if (username.equals("accord") && password.equals("java")) {
			System.out.println("Welcome, " + username + "!");
		} else {
			System.out.println("Invalid Login Credentials");
		}

	}
}
