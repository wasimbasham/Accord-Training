package j14l1;

import java.io.*;

public class LabThree {
	public static void main(String[] args) throws IOException {
		Employees employee = new Employees(1, "Wasim", 45000.0);
		FileOutputStream fos = new FileOutputStream(
				"D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j14l1\\emp.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(employee);
		oos.flush();
		oos.close();
		System.out.println("Serialized...");

	}
}
