package j10l2;

abstract class Employee {
	protected double basicPay;
	protected double pf;

	public abstract void attendance();

	public final void removeEmployee() {
		System.out.println("Employee removed.");
	}

	public double calculateSalary() {
		return basicPay - pf;
	}
}

class Marketing extends Employee {
	private double incentives;

	public Marketing(double basicPay, double pf, double incentives) {
		this.basicPay = basicPay;
		this.pf = pf;
		this.incentives = incentives;
	}

	public void attendance() {

		System.out.println("Attendance marked for Marketing employee...");
	}

	public double calculateSalary() {
		return super.calculateSalary() + incentives;
	}
}

class NewJoinee extends Employee {

	public void attendance() {

		System.out.println("Attendance marked for New Joinee...");
	}
}

class LabTwo {
	public static void main(String args[]) {

		Marketing e = new Marketing(25000, 1200, 6000);
		e.attendance();
		System.out.println("Take Home salary of Employee is : " + e.calculateSalary());
		e.removeEmployee();
		NewJoinee n = new NewJoinee();
		n.attendance();

	}
}
