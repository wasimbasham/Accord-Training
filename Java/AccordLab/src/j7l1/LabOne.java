package j7l1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.next();
		int Vcount = 0, Ccount = 0;
		String s = str.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				Vcount++;
			} else {
				Ccount++;
			}
		}
		System.out.println("Vowels count : " + Vcount);
		System.out.println("Consonant count : " + Ccount);

	}

}
