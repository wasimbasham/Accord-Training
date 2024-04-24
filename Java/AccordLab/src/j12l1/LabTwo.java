package j12l1;

import java.io.Console;

public class LabTwo {
	public static void main(String[] args) {
		Console c = System.console();
		if (c == null) {
			System.out.println("Please use the Terminal. 'ctrl+alt+t'");
			return;
		}
		try {
			String dividendS = c.readLine("Enter the dividend: ");
			int dividend = Integer.parseInt(dividendS);
			String divisorS = c.readLine("Enter the divisor: ");
			int divisor = Integer.parseInt(divisorS);
			int quotient = dividend / divisor;
			int remainder = dividend % divisor;
			System.out.println("Quotient: " + quotient);
			System.out.println("Remainder: " + remainder);
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter valid integers.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error. Please make sure the divisor is not zero.");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		}
	}
}
