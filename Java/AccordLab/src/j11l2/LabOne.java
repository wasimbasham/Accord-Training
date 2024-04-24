package j11l2;

import java.util.Scanner;

class Bank {
	public double interestCalculation(int accountBalance) {

		return (accountBalance * 3) / 100;
	}
}

class ICICI extends Bank {
	public double interestCalculation(int accountBalance) {

		return (accountBalance * 4) / 100;
	}
}

class SBI extends Bank {
	public double interestCalculation(int accountBalance) {

		return (accountBalance * 4.5) / 100;
	}
}

public class LabOne {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
		ICICI i = new ICICI();
		SBI s = new SBI();
		System.out.println("Enter Your Account Balance to calculate interest : ");
		int d = sc.nextInt();
		System.out.println("Standard Bank Interest : " + b.interestCalculation(d));
		System.out.println("ICICI Bank Interest : " + i.interestCalculation(d));
		System.out.println("SBI Bank Interest : " + s.interestCalculation(d));
		sc.close();

	}

}
