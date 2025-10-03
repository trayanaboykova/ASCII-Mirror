package asciimirror;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the file path:");
        String path = sc.nextLine();

        // Echo the exact input
        System.out.println(path);

        // Cow, each line is exactly 16 characters wide
        System.out.println("            ^__^");
        System.out.println("    _______/(oo)");
        System.out.println("/\\/(       /(__)");
        System.out.println("   | w----||    ");
        System.out.println("   ||     ||    ");
    }
}
