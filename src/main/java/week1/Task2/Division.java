package week1.Task2;

public class Division implements Operation {
    @Override
    public double execute(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
    }
}