package j14l1;

import java.io.Serializable;

public class Employees implements Serializable {
	private static int id;
	private static String name;
	private static double salary;

	public Employees(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public static void main(String args[]) {

	}

}
