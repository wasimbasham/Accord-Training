package j9l1;

class Shape {
	void printShape() {
		System.out.println("This is a Shape");
	}
}

class Rectangles extends Shape {
	void printRectangle() {
		System.out.println("This is Rectangle");
	}
}

class Circle extends Shape {
	void printCircle() {
		System.out.println("This is Cirlce");
	}
}

class Squares extends Rectangles {
	void printSquare() {
		System.out.println("This is Square of Rectangle");
	}
}

public class LabThree {

	public static void main(String[] args) {
		Squares s = new Squares();
		s.printShape();
		s.printRectangle();

	}

}
