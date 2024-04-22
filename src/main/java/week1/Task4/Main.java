package week1.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the weekday number (1 for Monday, 2 for Tuesday, ..., 7 for Sunday):");
        int weekdayNumber = scanner.nextInt();

        WeekdayPrinter weekdayPrinter = new WeekdayPrinter();
        weekdayPrinter.printDay(weekdayNumber);
    }
}