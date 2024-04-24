package j5l1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an string to convert it into character array : ");
		String a = sc.nextLine();
		char b[] = a.toCharArray();
		for (int i = 0; i < a.length(); i++) {
			System.out.println(b[i]);
		}
	}

}
