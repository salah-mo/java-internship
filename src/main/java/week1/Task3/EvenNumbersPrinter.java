package week1.Task3;

public class EvenNumbersPrinter {
    public void printEvenNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
