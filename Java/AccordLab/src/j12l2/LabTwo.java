package j12l2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LabTwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int age = getAgeFromUser(scanner);
            checkVotingEligibility(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } finally {
            scanner.close();
        }
    }

    private static int getAgeFromUser(Scanner scanner) throws InvalidAgeException {
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative.");
        }
        return age;
    }

    private static void checkVotingEligibility(int age) {
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote yet.");
        }
    }

    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
