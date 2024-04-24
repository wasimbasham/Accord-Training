package J4l1;

import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter 10 numbers to find even numbers: ");

		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println("The Even numbers from given inputs are : " + arr[i]);
			}

		}

	}

}
