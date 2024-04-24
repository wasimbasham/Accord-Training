package j14l2;

import java.util.Scanner;

class Student {
	int regNo;
	String name;
	double[] marks;

	Student(int regNo, String name, double[] marks) {
		this.regNo = regNo;
		this.name = name;
		this.marks = marks;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double[] getMarks() {
		return marks;
	}

	public void setMarks(double[] marks) {
		this.marks = marks;
	}

}

public class LabTwo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter student registration number:");
		int regNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter student name:");
		String name = scanner.nextLine();
		double[] marks = new double[5];
		System.out.println("Enter marks for 5 subjects:");
		for (int i = 0; i < 5; i++) {
			System.out.print("Subject " + (i + 1) + ": ");
			marks[i] = scanner.nextDouble();
		}

		Student student = new Student(regNo, name, marks);
		System.out.println("Student created successfully:");
		System.out.println("Registration Number: " + student.getRegNo());
		System.out.println("Name: " + student.getName());
		System.out.println("Marks:");
		double[] studentMarks = student.getMarks();
		for (int i = 0; i < 5; i++) {
			System.out.println("Subject " + (i + 1) + ": " + studentMarks[i]);
		}
		scanner.close();
	}
}
