package j3l2;

public class LabFour {

	public static void main(String[] args) {
		System.out.println("The prime numbers between 1 to 20 are...");
		for (int i = 2; i <= 20; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + " ");
			}
		}

	}

}
