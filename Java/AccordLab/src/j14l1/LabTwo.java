package j14l1;

import java.util.Scanner;

class Employee {

	private static int id;
	private static String name;
	private static String designation;
	private static double salary;

	public Employee(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

}

public class LabTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee ID:");
		int id = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter employee name:");
		String name = scanner.nextLine();
		System.out.println("Enter employee designation:");
		String designation = scanner.nextLine();
		System.out.println("Enter employee salary:");
		double salary = scanner.nextDouble();
		Employee employee = new Employee(id, name, designation, salary);
		System.out.println("Employee created successfully:");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Designation: " + designation);
		System.out.println("Salary:" + salary);
		scanner.close();
	}
}
