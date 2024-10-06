import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        // Create a file object for the file to be read
        File file = new File("sample.txt");  // The file should exist in the same directory as this program

        // Initialize word count to 0
        int wordCount = 0;

        // Try to read the file and count the words
        try {
            Scanner fileScanner = new Scanner(file);

            // Loop through each line of the file
            while (fileScanner.hasNextLine()) {
                // Read the line and split into words
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+");  // Split the line by spaces
                wordCount += words.length;
            }

            // Output the word count
            System.out.println("The total number of words in the file is: " + wordCount);

            // Close the file scanner
            fileScanner.close();

        } catch (FileNotFoundException e) {
            // Handle the case when the file is not found
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
