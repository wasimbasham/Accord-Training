package j13l1;

import java.io.FileReader;
import java.io.IOException;

public class LabOne {
	public static void main(String[] args) {
		try {
			String filePath = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j13l1\\Hello.txt";
			FileReader reader = new FileReader(filePath);
			int character;
			int count = 0;
			while ((character = reader.read()) != -1) {
				count++;
			}
			reader.close();
			System.out.println("Number of characters in the file: " + count);
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}
	}
}
