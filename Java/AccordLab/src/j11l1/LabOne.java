package j11l1;

class Box {
	public static int Area(int l, int b) {
		return l * b;
	}

	public static int Area(int a) {
		return a * a;
	}
}

public class LabOne {

	public static void main(String[] args) {
		Box b = new Box();
		System.out.println("Area of Rectangle is :" + b.Area(10, 15));
		System.out.println("Area of Square is :" + b.Area(4));
	}

}