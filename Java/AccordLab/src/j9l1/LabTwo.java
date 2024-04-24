package j9l1;

class Rectangle {
	int length, breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void area() {
		System.out.println("Area of Rectangle:" + length * breadth);
	}

	void Perimeter() {
		System.out.println("Perimeter of Rectangle:" + 2 * (length + breadth));
	}
}

class Square extends Rectangle {

	public Square(int length, int breadth) {
		super(length, breadth);
	}
}

public class LabTwo {

	public static void main(String[] args) {
		Square square = new Square(45, 70);
		square.area();
		square.Perimeter();
	}
}