package week2.Task2;

public class AverageCalculator implements ArrayOperations {
    @Override
    public double perform(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}