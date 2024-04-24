package j7l1;

import java.util.Scanner;

public class LabSix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.nextLine();
		s = s.replaceAll("\\s+", "");
		System.out.println("Result : " + s);
	}

}
