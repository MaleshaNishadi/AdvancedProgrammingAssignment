import java.util.Scanner;

public class ValidatorAI {
    public static int getValidInt(Scanner sc, String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            if (sc.hasNextInt()) {
                value = sc.nextInt();
                sc.nextLine(); // Clear scanner buffer
                return value;
            } else {
                System.out.println("Invalid input. Please enter an integer.");
                sc.next(); 
            }
        }
    }

    public static String getValidString(Scanner sc, String prompt) {
        String input;
        while (true) {
            System.out.print(prompt);
            input = sc.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println("Input cannot be empty.");
        }
    }
}