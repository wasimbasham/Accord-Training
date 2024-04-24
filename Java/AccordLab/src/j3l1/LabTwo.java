package j3l1;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check whether it is positive or not:");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("The given number is positive...");
		}
		else if(a==0) {
			System.out.println("The given number is neutral...");
		}
		else{
			System.out.println("The given number is negative...");
		}

	}

}
