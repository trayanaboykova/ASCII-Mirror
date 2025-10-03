package asciimirror;

public class Main {
    public static void main(String[] args) {
        String[] lines = {
                "                    _______ ",
                "                   < hello >",
                "                    ------- ",
                "            ^__^   /        ",
                "    _______/(oo)  /         ",
                "/\\/\\(       /(__)            ",
                "   | w----||                ",
                "   ||     ||                "
        };

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
