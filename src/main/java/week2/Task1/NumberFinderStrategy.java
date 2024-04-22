package week2.Task1;

public class NumberFinderStrategy {
    private NumberFinder numberFinder;

    public NumberFinderStrategy(NumberFinder numberFinder) {
        this.numberFinder = numberFinder;
    }

    public int find(int[] array, int number) {
        return this.numberFinder.find(array, number);
    }
}