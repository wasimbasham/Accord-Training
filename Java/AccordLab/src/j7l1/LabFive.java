package j7l1;

import java.util.Scanner;

public class LabFive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any string : ");
		String s = sc.nextLine();
		String rev=" ";
		String words[]=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			String revWord=" ";
			for (int j=word.length()-1;j>=0;j--) {
				revWord=revWord+word.charAt(j);
			}
			rev=rev+revWord+" ";
		}
		System.out.println("Result is : "+rev);

	}

}
