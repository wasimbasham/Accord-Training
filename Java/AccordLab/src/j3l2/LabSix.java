package j3l2;

public class LabSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("Accord InfoMatrix");
			} else if (i % 3 == 0) {
				System.out.println("Accord");
			} else if (i % 5 == 0) {
				System.out.println("InfoMatrix");
			} else {
				System.out.println(i);
			}
		}
	}

}
