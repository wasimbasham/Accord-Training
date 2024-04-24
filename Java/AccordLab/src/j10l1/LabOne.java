package j10l1;

abstract class Bank {
	abstract int getBalance(int deposit);
}

class Bank_A extends Bank {

	int getBalance(int deposit) {
		int balance = 500;
		return balance + deposit;
	}

}

class Bank_B extends Bank {

	int getBalance(int deposit) {
		int balance = 700;
		return balance + deposit;
	}

}

class Bank_C extends Bank {

	int getBalance(int deposit) {
		int balance = 800;
		return balance + deposit;
	}

}

public class LabOne {

	public static void main(String[] args) {

		Bank b1 = new Bank_A();
		Bank b2 = new Bank_B();
		Bank b3 = new Bank_C();
		System.out.println("Bank A Balance is : " + b1.getBalance(100));
		System.out.println("Bank B Balance is : " + b2.getBalance(150));
		System.out.println("Bank C Balance is : " + b3.getBalance(200));

	}

}
