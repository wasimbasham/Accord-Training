package J4l1;

public class LabTwo {

	public static void main(String[] args) {
		int largest = 0;
		int arr[] = { 3, 6, 5, 9, 2, 7, 4 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println(largest);
	}
}
