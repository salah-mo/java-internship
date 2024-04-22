package week1.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        double num2 = scanner.nextDouble();

        Calculator sumCalculator = new Calculator(new Sum());
        System.out.println("The sum is: " + sumCalculator.calculate(num1, num2));

        Calculator differenceCalculator = new Calculator(new Difference());
        System.out.println("The difference is: " + differenceCalculator.calculate(num1, num2));

        Calculator productCalculator = new Calculator(new Product());
        System.out.println("The product is: " + productCalculator.calculate(num1, num2));

        try {
            Calculator divisionCalculator = new Calculator(new Division());
            System.out.println("The division is: " + divisionCalculator.calculate(num1, num2));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}