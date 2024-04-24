package j4l2;

public class LabThree {

	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		int b[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };
		boolean result = true;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				if (a[i][j] != b[i][j]) {
					result = false;
				}
			}

		}
		if (result == true) {
			System.out.println("The matrices are equal");
		} else {
			System.out.println("The matrices are not equal");
		}

	}

}
