package j13l2;

import java.io.*;
import java.util.*;

public class LabTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = scanner.nextLine();
        scanner.close();

        File file = new File(fileName);
        FileReader fr = null;
        BufferedReader br = null;
        String[] words = new String[1000];
        int count = 0;

        try {
            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                for (String word : lineWords) {
                    if (!word.isEmpty()) {
                        words[count++] = word.toLowerCase();
                    }
                }
            }
            Arrays.sort(words, 0, count);
            for (int i = 0; i < count; i++) {
                System.out.println(words[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
                if (br != null)
                    br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
