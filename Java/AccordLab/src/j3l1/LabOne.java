package j3l1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find odd or even:");
		int a=sc.nextInt();
		if(a%2==0) {
			System.out.println("The entered number is Even...");
		}
		else {
			System.out.println("The entered number is Odd...");
		}
		
	}

}
