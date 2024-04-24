package j7l1;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String str = sc.next();
		char ch[] = str.toCharArray();
		char abs[]=str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] != abs[i]) {
					System.out.println(abs[i]);
				}
			}
		}

	}
}
