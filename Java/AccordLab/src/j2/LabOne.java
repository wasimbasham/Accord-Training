package j2;

public class LabOne {

	public static void main(String[] args) {

		int principalAmount = 10000;
		float interestRate = 9.0f;
		int timePeriod = 3;

		double simpleInterest = principalAmount * interestRate * timePeriod / 100d;

		System.out.println("Simple interest for the given amount is: Rs." + simpleInterest);

	}

}
