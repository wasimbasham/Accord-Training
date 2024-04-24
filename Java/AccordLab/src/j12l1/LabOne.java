package j12l1;

import java.util.Scanner;

public class LabOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();
		int[] array = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.print("Enter element at position " + i + ": ");
			array[i] = sc.nextInt();
		}

		try {

			System.out.print("Enter the position of the dividend: ");
			int dividendPosition = sc.nextInt();

			System.out.print("Enter the position of the divisor: ");
			int divisorPosition = sc.nextInt();
			int dividend = array[dividendPosition];
			int divisor = array[divisorPosition];
			int quotient = dividend / divisor;
			int remainder = dividend % divisor;

			System.out.println("Quotient: " + quotient);
			System.out.println("Remainder: " + remainder);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds. Please enter valid positions.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero error. Please make sure the divisor is not zero.");
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());
		} finally {
		}
	}
}
