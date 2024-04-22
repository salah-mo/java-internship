package week2.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[15];
        for (int i = 0; i < 15; i++) {
            array[i] = scanner.nextInt();
        }
        int number = scanner.nextInt();

        NumberFinderStrategy strategy = new NumberFinderStrategy(new FirstOccurrenceFinder());
        int position = strategy.find(array, number);

        if (position != -1) {
            System.out.println("The first occurrence of " + number + " is at position: " + position);
        } else {
            System.out.println("The number " + number + " is not found in the array.");
        }
    }
}