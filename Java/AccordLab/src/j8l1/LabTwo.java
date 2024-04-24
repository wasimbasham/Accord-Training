package j8l1;

import java.util.Scanner;

class Circles {
	int r;

	double radius(int r) {
		this.r = r;
		return r;
	}

	double areaOfCircle(int r) {
		this.r = r;
		return 3.14 * r * r;
	}

	double perimeter(int r) {
		this.r = r;
		return 2 * 3.14 * r;
	}
}

public class LabTwo {

	public static void main(String[] args) {

		Circles circle = new Circles();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius : ");
		int r = sc.nextInt();
		System.out.println("Entered radius is : " + circle.radius(r));
		System.out.println("Area of Circle : " + circle.areaOfCircle(r));
		System.out.println("Perimeter value is : " + circle.perimeter(r));
	}

}
