package j14l1;

import java.io.Serializable;

public class LabOne implements Serializable {
	private static int id = 101;
	private static String name = "wasim";
	private static String designation = "Developer";
	private static double salary = 45000.0;

	public LabOne(int id, String name, String designation, double salary) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDesignation() {
		return designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String args[]) {
		System.out.println( "Employee: " + "\n id=" + id + "\n name=" + name + " \n designation=" + designation + "\n salary=" + salary);
	}
}
