package week2.Task2;

public class CalculatorStrategy {
    private ArrayOperations arrayOperations;

    public CalculatorStrategy(ArrayOperations arrayOperations) {
        this.arrayOperations = arrayOperations;
    }

    public double perform(int[] array) {
        return this.arrayOperations.perform(array);
    }
}