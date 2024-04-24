package j10l1;

abstract class Marks {
	abstract double getPercentage();
}

class studentA extends Marks {
	double s1, s2, s3;

	public studentA(double s1, double s2, double s3) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}

	double getPercentage() {
		return (((s1 + s2 + s3) / 300) * 100);
	}

}

class studentB extends Marks {

	double s1, s2, s3, s4;

	public studentB(double s1, double s2, double s3, double s4) {
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
	}

	double getPercentage() {
		return (((s1 + s2 + s3 + s4) / 400) * 100);
	}

}

public class LabTwo {

	public static void main(String[] args) {

		Marks m1 = new studentA(97, 75, 86);
		Marks m2 = new studentB(64, 75, 97, 65);
		System.out.println("Percenatge of Student A is : " + m1.getPercentage());
		System.out.println("Percenatge of Student B is : " + m2.getPercentage());

	}

}
