package j6l2;

public class LabTwo {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			avg = sum / a.length;
		}
		System.out.println("Sum of the Series is : " + sum);
		System.out.println("Average of the series is : " + avg);
	}

}
