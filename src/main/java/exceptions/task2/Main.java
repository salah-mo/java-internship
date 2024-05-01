package exceptions.task2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        FileReader fileReader = new FileReader("src/main/java/exceptions/task2/Lincoln.txt");
        WordCounter wordCounter = new WordCounter();

        try {
            String text = fileReader.readFile();
            int wordCount = wordCounter.countWords(text);
            System.out.println("Number of words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}