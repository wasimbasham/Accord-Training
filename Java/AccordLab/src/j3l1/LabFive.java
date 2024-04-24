package j3l1;

import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age: ");
		int age = sc.nextInt();

		if (age > 20) {
			System.out.println("Please enter your salary: ");
			int salary = sc.nextInt();

			if (salary >= 25000) {
				System.out.println("Your loan is sanctioned...");
			} else {
				System.out.println("Your loan is rejected...");
			}
		} else {
			System.out.println("Your should be greater than 20...");
		}

	}

}
