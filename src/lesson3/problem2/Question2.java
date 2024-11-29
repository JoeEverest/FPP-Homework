package lesson3.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        LocalDate dateOfBirth = null;
        while (dateOfBirth == null) {
            System.out.print("Enter date of birth (yyyy-mm-dd): ");
            String dobInput = scanner.nextLine();

            try {
                dateOfBirth = LocalDate.parse(dobInput, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            } catch (DateTimeParseException e) {
                System.out.println("Invalid date format. Please enter the date in yyyy-mm-dd format.");
            }
        }
        scanner.close();


        HeartRates heartRates = new HeartRates(firstName, lastName, dateOfBirth);

        System.out.println(heartRates);

        heartRates.getTargetHRRange();
    }
}
