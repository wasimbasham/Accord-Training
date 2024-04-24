package j6l1;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find the palindrom : ");
		int a = sc.nextInt();
		int res = 0, sum = 0;
		int pal = a;
		while (a > 0) {
			res = a % 10;
			sum = (sum * 10) + res;
			a = a / 10;
		}

		if (sum == pal) {
			System.out.println("It is a Palindrom");
		} else {
			System.out.println("It is not a palindrom");
		}

	}

}
