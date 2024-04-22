package week2.Task1;

public class FirstOccurrenceFinder implements NumberFinder {
    @Override
    public int find(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                if (i < 5) {
                    continue;
                }
                return i;
            }
        }
        return -1; // return -1 if the number is not found
    }
}