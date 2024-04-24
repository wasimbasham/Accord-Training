package j13l1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class LabTwo {
	public static void main(String[] args) {
		String sourceFile = "C:\\Users\\wasim\\Pictures\\career-compass.png";
		String destinationFile = "C:\\Users\\wasim\\Pictures\\career-compass-1.png";
		try {
			FileInputStream inputStream = new FileInputStream(sourceFile);
			FileOutputStream outputStream = new FileOutputStream(destinationFile);
			byte[] buffer = new byte[1024];
			int bytesRead;
			while ((bytesRead = inputStream.read(buffer)) != -1) {
				outputStream.write(buffer, 0, bytesRead);
			}
			inputStream.close();
			outputStream.close();
			System.out.println("Image copied successfully.");
		} catch (IOException e) {
			System.out.println("Error copying image: " + e.getMessage());
		}
	}
}
