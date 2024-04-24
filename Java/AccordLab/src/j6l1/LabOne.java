package j6l1;

import java.util.Scanner;

public class LabOne {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number find the armstrong : ");
		int arm=sc.nextInt();
		int num=arm;
		int res=0, sum=0;

		while(arm>0) {
			res=arm%10;
			sum=sum+(res*res*res);
			arm=arm/10;
		}
		System.out.println("Sum of digits cube is : "+ sum);
		if(sum==num) {
			System.out.println("Amstrong number...");
		}
		else
		{
			System.out.println("Not a amstrong number...");
		}
		
	}

}
