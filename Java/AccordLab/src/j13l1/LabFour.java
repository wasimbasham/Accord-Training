package j13l1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class LabFour {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j13l1\\Hello.txt";
        String outputFile = "D:\\Github Repo\\AccordLab\\Java\\AccordLab\\src\\j13l1\\Hello1.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                String reversedLine = reverseString(line);
                writer.write(reversedLine);
                writer.newLine();
            }
            reader.close();
            writer.close();

            System.out.println("Content reversed and saved to " + outputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
