package j14l2;

import java.io.File;

public class LabFour {
	public static void main(String[] args) {
		String fileName = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j14l2\\Hi.txt";

		File file = new File(fileName);

		if (file.exists()) {

			throw new RuntimeException("File already exists: " + fileName);
		} else {
			try {
				if (file.createNewFile()) {
					System.out.println("File created successfully: " + fileName);
				} else {
					System.out.println("Failed to create the file: " + fileName);
				}
			} catch (Exception e) {
				System.err.println("An error occurred: " + e.getMessage());
			}
		}
	}
}
