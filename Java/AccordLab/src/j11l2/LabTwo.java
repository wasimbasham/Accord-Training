package j11l2;

class Employee {
	int staffId, basicSalary, allowances;
	String name;

	void displayPay(int staffId, int basicSalary, int allowances, String name) {
		this.staffId = staffId;
		this.basicSalary = basicSalary;
		this.allowances = allowances;
		this.name = name;
		System.out.println("...Regular Employee...");
		System.out.println("NAME : " + name);
		System.out.println("STAFF ID : " + staffId);
		System.out.println("BASIC PAY : " + basicSalary);
		System.out.println("ALLOWANCES : " + allowances);
		System.out.println("TOTALY NET PAY : " + (basicSalary + allowances));

	}

}

class Marketing {
	int staffId, basicSalary, allowances, incentives;
	String name;

	void displayPay(int staffId, int basicSalary, int allowances, String name, int incentives) {
		this.staffId = staffId;
		this.basicSalary = basicSalary;
		this.allowances = allowances;
		this.name = name;
		this.incentives = incentives;

		System.out.println("...Marketing Employee...");
		System.out.println("NAME : " + name);
		System.out.println("STAFF ID : " + staffId);
		System.out.println("BASIC PAY : " + basicSalary);
		System.out.println("ALLOWANCES : " + allowances);
		System.out.println("INCENTIVES : " + incentives);
		System.out.println("TOTALY NET PAY : " + (basicSalary + allowances + incentives));

	}

}

public class LabTwo {

	public static void main(String[] args) {
		Employee e = new Employee();
		Marketing m = new Marketing();
		e.displayPay(101, 15000, 5000, "Wasim");
		System.out.println();
		m.displayPay(102, 18000, 7000, "Basha", 6000);

	}

}
