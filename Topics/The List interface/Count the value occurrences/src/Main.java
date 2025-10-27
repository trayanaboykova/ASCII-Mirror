import java.util.List;

class Counter {

    public static boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        long count1 = list1.stream().filter(x -> x == elem).count();
        long count2 = list2.stream().filter(x -> x == elem).count();

        return count1 == count2;
    }
}
