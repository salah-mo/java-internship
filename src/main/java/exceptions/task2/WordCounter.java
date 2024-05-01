package exceptions.task2;

public class WordCounter {
    public int countWords(String text) {
        if (text == null || text.isEmpty()) {
            return 0;
        }

        // Split the text into words by whitespace
        String[] words = text.split("\\s+");
        return words.length;
    }
}