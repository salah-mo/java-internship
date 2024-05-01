package exceptions.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public String readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(filePath));
        // Read the entire file as a single string
        return scanner.useDelimiter("\\A").next();
    }
}
