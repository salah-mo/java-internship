package week2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        CalculatorStrategy sumStrategy = new CalculatorStrategy(new SumCalculator());
        double sum = sumStrategy.perform(array);
        System.out.println("The sum of the array elements is: " + sum);

        CalculatorStrategy averageStrategy = new CalculatorStrategy(new AverageCalculator());
        double average = averageStrategy.perform(array);
        System.out.println("The average of the array elements is: " + average);
    }
}