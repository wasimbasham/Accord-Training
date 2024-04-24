package j7l1;

import java.util.Scanner;

public class LabThree {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.nextLine();
		int count = 0;
		String s = str.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.'
					|| s.charAt(i) == '?' || s.charAt(i) == '-' || s.charAt(i) == '\'' || s.charAt(i) == '\"'
					|| s.charAt(i) == ':') {
				count++;
			}
		}
		System.out.println("punctuation count : " + count);

	}

}
