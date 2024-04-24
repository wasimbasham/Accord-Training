package j4l2;

import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {
		int a[][] = new int[3][3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers to print it in 3 * 3 matrix : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "\s");
			}
			System.out.println();
		}

	}

}
