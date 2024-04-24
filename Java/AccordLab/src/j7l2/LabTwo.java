package j7l2;

public class LabTwo {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				
			}
			for(int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) {
			for(int j=5;j>i;j--) {
				System.out.print(" ");
				
			}
			for(int m=1;m<=i;m++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
