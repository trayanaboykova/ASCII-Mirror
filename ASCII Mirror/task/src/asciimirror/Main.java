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
        if (!file.exists() || !file.isFile()) {
            System.out.println("File not found!");
            return;
        }

        List<String> lines = new ArrayList<>();
        try (Scanner fs = new Scanner(file)) {
            while (fs.hasNextLine()) {
                lines.add(fs.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            return;
        }

        if (lines.isEmpty()) return;

        int maxLen = 0;
        for (String s : lines) maxLen = Math.max(maxLen, s.length());

        for (String s : lines) {
            String left = padRight(s, maxLen);
            String right = mirror(left);
            System.out.println(left + " | " + right);
        }
    }

    private static String padRight(String s, int width) {
        if (s.length() >= width) return s;
        StringBuilder sb = new StringBuilder(width);
        sb.append(s);
        while (sb.length() < width) sb.append(' ');
        return sb.toString();
    }

    private static String mirror(String s) {
        // mapping of horizontally opposite characters
        Map<Character, Character> m = MIRROR_MAP;
        StringBuilder out = new StringBuilder(s.length());
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            out.append(m.getOrDefault(ch, ch)); // swap if mapping exists
        }
        return out.toString();
    }

    // Prebuilt map of mirror pairs
    private static final Map<Character, Character> MIRROR_MAP = buildMirrorMap();
    private static Map<Character, Character> buildMirrorMap() {
        Map<Character, Character> map = new HashMap<>();
        // pairs
        map.put('<', '>');
        map.put('>', '<');
        map.put('[', ']');
        map.put(']', '[');
        map.put('{', '}');
        map.put('}', '{');
        map.put('(', ')');
        map.put(')', '(');
        map.put('/', '\\');
        map.put('\\', '/');
        // everything else is symmetric by default (handled by getOrDefault)
        return map;
    }
}
