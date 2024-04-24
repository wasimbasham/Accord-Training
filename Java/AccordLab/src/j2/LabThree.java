package j2;

public class LabThree {

	public static void main(String[] args) {
		int a = 5;
		int b = 7;
		int c;

		System.out.println("Before swapping numbers:\n a=" + a + " \n b=" + b + "\n");

		c = a;
		a = b;
		b = c;

		System.out.println("After swapping numbers: \n a=" + a + " \n b=" + b);

	}
}
