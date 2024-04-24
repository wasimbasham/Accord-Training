package j12l1;

import java.util.Scanner;

public class LabThree {
	public static void main(String[] args) {
		Scanner sca = new Scanner(System.in);
		try {
			System.out.print("Enter the principal amount: ");
			double principal = sca.nextDouble();
			System.out.print("Enter the number of years: ");
			int years = sca.nextInt();
			System.out.print("Enter the rate of interest: ");
			double rate = sca.nextDouble();
			double simpleInterest = (principal * years * rate) / 100;
			System.out.println("Simple Interest: " + simpleInterest);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			sca.close();
		}
	}
}
