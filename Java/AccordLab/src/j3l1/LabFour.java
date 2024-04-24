package j3l1;

import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any single digit number : ");
		int a = sc.nextInt();

		switch (a) {
		case 1:
			System.out.println("the entered number is ONE");
			break;
		case 2:
			System.out.println("the entered number is TWO");
			break;
		case 3:
			System.out.println("the entered number is THREE");
			break;
		case 4:
			System.out.println("the entered number is FOUR");
			break;
		case 5:
			System.out.println("the entered number is FIVE");
			break;
		case 6:
			System.out.println("the entered number is SIX");
			break;
		case 7:
			System.out.println("the entered number is SEVEN");
			break;
		case 8:
			System.out.println("the entered number is EIGHT");
			break;
		case 9:
			System.out.println("the entered number is NINE");
			break;
		default:
			System.out.println("Please enter single digit number");
			break;
		}

	}

}
