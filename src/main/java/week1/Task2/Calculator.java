package week1.Task2;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return this.operation.execute(num1, num2);
    }
}