import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        // find the longest string
        String longest = Collections.max(list, Comparator.comparingInt(String::length));

        // replace all elements with the longest string
        Collections.fill(list, longest);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}
