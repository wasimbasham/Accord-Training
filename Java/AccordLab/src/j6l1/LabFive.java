package j6l1;

import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find Even or Odd: ");
		int a = sc.nextInt();

		if ((a / 2) * 2 == a) {
			System.out.println("Even number");
		} else {
			System.out.println("Odd number");
		}

	}

}
