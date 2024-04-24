package j2l2;

public class LabThree {

	public static void main(String[] args) {
		int year = 2028;

		String leapYear = (year % 4 == 0) ? "Leap year" : "Not a leap year";
		System.out.println(leapYear);

	}
}