package j13l2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LabOne {
	public static void main(String[] args) {
		String filePath = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j13l2\\Hello.txt";

		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));

			int alphabets = 0;
			int numbers = 0;
			int specialSymbols = 0;
			int blankSpaces = 0;
			String line;
			while ((line = reader.readLine()) != null) {
				for (char c : line.toCharArray()) {
					if (Character.isLetter(c)) {
						alphabets++;
					} else if (Character.isDigit(c)) {
						numbers++;
					} else if (Character.isWhitespace(c)) {
						blankSpaces++;
					} else {
						specialSymbols++;
					}
				}
			}
			reader.close();
			System.out.println("Number of Alphabets: " + alphabets);
			System.out.println("Number of Numbers: " + numbers);
			System.out.println("Number of Special Symbols: " + specialSymbols);
			System.out.println("Number of Blank Spaces: " + blankSpaces);
		} catch (IOException e) {
			System.out.println("Error reading the file: " + e.getMessage());
		}
	}
}
