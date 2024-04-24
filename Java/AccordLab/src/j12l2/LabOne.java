package j12l2;

public class LabOne {

	public static void main(String[] args) {
		try {
			checkLoanEligibility("Chennai", 25);
		} catch (InvalidLocationException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
			checkLoanEligibility("Bangalore", 30);
		} catch (InvalidLocationException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}

		try {
			checkLoanEligibility("Chennai", 20);
		} catch (InvalidLocationException | InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void checkLoanEligibility(String city, int age) throws InvalidLocationException, InvalidAgeException {
		if (!isValidLocation(city)) {
			throw new InvalidLocationException(
					"Invalid location. Loan available only in Chennai, Mumbai, Delhi, or Kolkata.");
		}

		if (age < 23) {
			throw new InvalidAgeException("Invalid age. Minimum age for loan is 23.");
		}

		System.out.println("Congratulations! You are eligible for the loan.");
	}

	private static boolean isValidLocation(String city) {
		String[] validCities = { "Chennai", "Mumbai", "Delhi", "Kolkata" };
		for (String validCity : validCities) {
			if (validCity.equalsIgnoreCase(city)) {
				return true;
			}
		}
		return false;
	}

	public static class InvalidLocationException extends Exception {
		public InvalidLocationException(String message) {
			super(message);
		}
	}

	public static class InvalidAgeException extends Exception {
		public InvalidAgeException(String message) {
			super(message);
		}
	}
}
