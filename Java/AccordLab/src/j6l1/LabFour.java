package j6l1;

public class LabFour {

	public static void main(String[] args) {
		int a = 0, b = 1, c;
		for (int i = 0; i < 10; i++) {
			System.out.print(a + "\s");
			c = a + b;
			a = b;
			b = c;
		}

	}

}
