package j6l1;

import java.util.Scanner;

public class LabSix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Nth term of the series 1,3,6,10,15,21 : ");
		int a = sc.nextInt();
		int res=0;
		for(int i=1;i<=a;i++) {
			res=res+i;
		}
		System.out.println(res);

	}

}
