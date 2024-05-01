package exceptions.task1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber;
        int secondNumber;

        try {
            System.out.print("First integer: ");
            firstNumber = scanner.nextInt();
            System.out.print("Second integer: ");
            secondNumber = scanner.nextInt();

            int sum = firstNumber + secondNumber;
            System.out.println("Sum is " + sum);
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input! Please enter valid integers.");
            // Clear scanner buffer and read input again
            scanner.nextLine();
            main(args);
        }
    }
}
