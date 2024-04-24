package j6l2;

public class LabThree {

	public static void main(String[] args) {

		int a[] = { 8, 9, 3, 6, 2, 4 };
		int sort = 1;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					sort = a[i];
					a[i] = a[j];
					a[j] = sort;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
