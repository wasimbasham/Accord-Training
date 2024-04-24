package j12l2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabThree {

	private static final double RATE_1 = 0.4;
	private static final double RATE_2 = 0.5;
	private static final double RATE_3 = 0.6;
	private static final double MIN_CHARGE = 50.0;
	private static final double SURCHARGE_RATE = 0.15;
	private static final double SURCHARGE_THRESHOLD = 250.0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int units = getUnitsFromUser(scanner);
			double charges = calculateCharges(units);
			System.out.printf("Electricity charges for %d units: Rs.%.2f\n", units, charges);
		} catch (InvalidUnitsException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a valid integer for units.");
		} finally {
			scanner.close();
		}
	}

	private static int getUnitsFromUser(Scanner scanner) throws InvalidUnitsException {
		System.out.print("Enter number of units consumed: ");
		int units = scanner.nextInt();
		if (units < 0) {
			throw new InvalidUnitsException("Number of units cannot be negative.");
		}
		return units;
	}

	private static double calculateCharges(int units) {
		double totalCharge = 0.0;

		if (units <= 100) {
			totalCharge = units * RATE_1;
		} else if (units <= 300) {
			totalCharge = 100 * RATE_1 + (units - 100) * RATE_2;
		} else {
			totalCharge = 100 * RATE_1 + 200 * RATE_2 + (units - 300) * RATE_3;
		}

		totalCharge = Math.max(totalCharge, MIN_CHARGE);

		if (totalCharge > SURCHARGE_THRESHOLD) {
			totalCharge += totalCharge * SURCHARGE_RATE;
		}

		return totalCharge;
	}

	public static class InvalidUnitsException extends Exception {
		public InvalidUnitsException(String message) {
			super(message);
		}
	}
}
