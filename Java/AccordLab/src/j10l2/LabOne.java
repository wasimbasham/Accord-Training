package j10l2;

abstract class Shape {
	abstract double printarea();
}

class Circle extends Shape {
	double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	double printarea() {
		return 3.14 * radius * radius;
	}
}

class Triangle extends Shape {
	double breadth, height;

	public Triangle(double breadth, double height) {
		this.breadth = breadth;
		this.height = height;
	}

	double printarea() {
		return 0.5 * breadth * height;
	}
}

class Rectangle extends Shape {
	double length, breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	double printarea() {
		return length * breadth;
	}
}

public class LabOne {

	public static void main(String[] args) {
		Shape s1 = new Circle(7);
		Shape s2 = new Triangle(24, 15);
		Shape s3 = new Rectangle(70, 40);
		System.out.println("Area of Circle is :" + s1.printarea());
		System.out.println("Area of Triangle is :" + s2.printarea());
		System.out.println("Area of Rectangle is :" + s3.printarea());
	}

}