package asciimirror;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the file path:");
        String path = sc.nextLine();

        File file = new File(path);

        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found!");
        } else {
            try (Scanner fileScanner = new Scanner(file)) {
                while (fileScanner.hasNextLine()) {
                    System.out.println(fileScanner.nextLine());
                }
            } catch (FileNotFoundException e) {
                System.out.println("File not found!");
            }
        }
    }
}
