package week2.Task2;

public class SumCalculator implements ArrayOperations {
    @Override
    public double perform(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}