package j5l1;

import java.util.Scanner;

public class LabTwo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of characters you want to store: ");
		int store=sc.nextInt();
		System.out.println("Enter the array of characters to convert it into string: ");
		char[] characters = new char[store];
		for(int i=0;i<store;i++) {
			characters=sc.next().toCharArray();
		}
		
		for(int i=0;i<=store;i++) {
			for(int j=1;j<=store;j++) {
				char temp=characters[i];
				characters[i]=characters[j];
				characters[j]=temp;
			}
			
		}
		System.out.println(characters);
	}
}
