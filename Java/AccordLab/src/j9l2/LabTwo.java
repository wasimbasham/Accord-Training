package j9l2;

import java.util.Scanner;

class Employee {
	String name;
	int id, salary;
	String designation;
	String department;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}

class Marketing extends Employee {
	int incentives;

	public int getIncentives() {
		return incentives;
	}

	public void setIncentives(int incentives) {
		this.incentives = incentives;
	}

	public void totalpay() {
		System.out.println("Total Salary:Rs." + (super.salary + incentives));
	}
}

public class LabTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Department : ");
		String dept = sc.next();
		System.out.println("Enter Designation : ");
		String designation = sc.next();
		System.out.println("Enter salary : ");
		int salary = sc.nextInt();
		System.out.println("Enter Incentives : ");
		int incentives = sc.nextInt();
		Marketing m = new Marketing();
		m.setId(id);
		m.setName(name);
		m.setDepartment(dept);
		m.setDesignation(designation);
		m.setSalary(salary);
		m.setIncentives(incentives);
		System.out.println("ID:" + m.getId());
		System.out.println("NAME:" + m.getName());
		System.out.println("DEPARTMENT:" + m.getDepartment());
		System.out.println("DESIGNATION:" + m.getDesignation());
		System.out.println("BASIC SALaRY:" + m.getSalary());
		System.out.println("Incentives:Rs." + m.getIncentives());
		m.totalpay();
	}

}
