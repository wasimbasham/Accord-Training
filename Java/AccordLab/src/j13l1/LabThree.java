package j13l1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LabThree {
	public static void main(String[] args) {
		String filePath = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j13l1\\Hello.txt";
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}
	}
}
