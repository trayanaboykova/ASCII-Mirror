package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the file path:");
        String path = sc.nextLine();

        File file = new File(path);

        // Check if file exists and is a file
        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found!");
            return;
        }

        List<String> lines = new ArrayList<>();

        // Read all lines into a list
        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        if (lines.isEmpty()) {
            return;
        }

        // Find the longest line
        int maxLength = 0;
        for (String line : lines) {
            if (line.length() > maxLength) {
                maxLength = line.length();
            }
        }

        // Print each line formatted
        for (String line : lines) {
            // pad the line with spaces to match maxLength
            String formatted = String.format("%-" + maxLength + "s", line);
            System.out.println(formatted + " | " + formatted);
        }
    }
}
