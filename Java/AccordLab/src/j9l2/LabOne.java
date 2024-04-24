package j9l2;

class Savings {
	int balance, deptamt, withamt, n, i, r;

	public Savings(int balance, int deptamt, int withamt, int n, int r) {
		this.balance = balance;
		this.deptamt = deptamt;
		this.n = n;
		this.r = r;
		this.withamt = withamt;

	}

	void SimpleInterest() {
		System.out.println("Simple Interest : " + (balance * n * r) / 100);
	}

	void depositAmount() {
		balance = balance + deptamt;
		System.out.println("After deposit amount : " + balance);
	}

	void withdrawAmount() {
		balance = balance - withamt;
		System.out.println("After Withdraw balance : " + balance);
	}
}

class Current extends Savings {

	public Current(int balance, int deptamt, int withdamt, int n, int r) {
		super(balance, deptamt, withdamt, n, r);
	}

	void print() {
		super.depositAmount();
		super.withdrawAmount();
	}
}

public class LabOne {

	public static void main(String[] args) {
		Current C = new Current(10000, 7000, 2000, 2, 7);
		C.print();
		C.SimpleInterest();

	}

}
