package j6l2;

import java.util.Scanner;

public class LabFour {

	public static void main(String[] args) {
		int a[] = { 5, 1, 3, 4, 7, 2, 6 };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to find it's pair : ");
		int b = sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == b) {
					System.out.println(a[i] + " " + a[j]);
				}
			}
		}

	}

}
