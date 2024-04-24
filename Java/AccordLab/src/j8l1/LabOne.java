package j8l1;

import java.util.Scanner;

class Calculator {
	int a, b;

	int add(int a, int b) {
		this.a = a;
		this.b = b;
		return a + b;
	}

	int sub(int a, int b) {
		this.a = a;
		this.b = b;
		return a - b;
	}

	int mul(int a, int b) {
		this.a = a;
		this.b = b;
		return a * b;
	}

	int div(int a, int b) {
		this.a = a;
		this.b = b;
		return a / b;
	}
}

public class LabOne {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 2 numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Addition value is : "+calculator.add(a, b));
		System.out.println("Subtraction value is : "+calculator.sub(a, b));
		System.out.println("Multiplication value is : "+calculator.mul(a, b));
		System.out.println("Division value is : "+calculator.div(a, b));

	}

}
