package j4l2;

public class LabTwo {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int b[][] = { { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		int c[][] = new int[2][2];
		System.out.println("The Sum of 2 matrixes are: ");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + "\s");
			}

			System.out.println();
		}

	}

}
