package j3l2;

import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any number to reverse it : ");
		int rev=sc.nextInt();
		int rem;
		while(rev>0){
			rem=rev%10;
			rev=rev/10;
			System.out.println(rem);
		}
	}

}
