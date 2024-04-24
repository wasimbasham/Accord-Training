package J4l1;

public class LabOne {

	public static void main(String[] args) {
		int sum=0;
		int avg=0;
		int arr[]= {1,2,3,4,5};
		for(int i=0;i<=4;i++) {
			sum=sum+arr[i];
			avg=sum/4;
		}
		System.out.println("Sum of total number is: " + sum);
		System.out.println("Average of total number is: " + avg);
	}

}
