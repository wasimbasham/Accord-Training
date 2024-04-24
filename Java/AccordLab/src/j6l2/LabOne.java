package j6l2;

public class LabOne {

	public static void main(String[] args) {
		int a[] = { 8, 9, 3, 6, 2, 4 };
		int largest = a[0];
		int secondLargest = a[1];
		int smallest=a[0];
		int secondSmallest=a[1];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > largest) {
				secondLargest=largest;
				largest = a[i];
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
			}
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < smallest) {
				secondSmallest=smallest;
				smallest = a[i];
			} else if (a[i] < secondSmallest) {
				secondSmallest = a[i];
			}
		}

		System.out.println("Second largest is : " + secondLargest);
		System.out.println("Second Smallest is : " + secondSmallest);

	}

}
