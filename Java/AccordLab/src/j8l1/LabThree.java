package j8l1;

import java.util.Scanner;

class Student {
	int a, b, c, t, n;

	int total(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
		t = a + b + c;
		return t;
	}

	double average(int t, int n) {
		double avg = t / n;
		return avg;
	}
}

public class LabThree {

	public static void main(String[] args) {
		Student student = new Student();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 3 subjects marks : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int t = student.total(a, b, c);
		double average = student.average(t, 3);
		System.out.println("Total mark is : " + t);
		System.out.println("Average of total mark is : " + average);

	}

}
