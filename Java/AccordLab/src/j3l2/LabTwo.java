package j3l2;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number for mulitiplication table");
		int multi = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(multi + "x" + i + "=" + (multi * i));
		}

	}

}
