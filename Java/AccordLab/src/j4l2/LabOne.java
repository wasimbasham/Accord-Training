package j4l2;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {

		int arr[] = { 3, 2, 4, 5, 6, 1, 7, 2};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find all pairs on given integer : ");
		int a = sc.nextInt();
		System.out.println("The possible numbers are: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == a) {
					System.out.println(arr[i] + " " + arr[j]);
				}
			}
		}

	}

}
