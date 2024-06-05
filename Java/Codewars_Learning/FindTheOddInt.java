package Codewars_Learning;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findIt(new int[]{1, 7, 1, 7, 0, 0, 7}));
    }

    public static int findIt(int[] a) {
        return Arrays.stream(a)
                .boxed().collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet()
                .stream().filter(i -> i.getValue() % 2 == 1).mapToInt(Map.Entry::getKey).findFirst().orElse(0);
    }
}
