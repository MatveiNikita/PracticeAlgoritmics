package Codewars_Learning;

import java.util.Arrays;
import java.util.stream.Collectors;

public class YourOrderPlease {
    public static void main(String[] args) {
        System.out.println(order("is2 Thi1s T4est 3a"));

    }
    public static String order(String words) {
        return Arrays.stream(words.split(" "))
                .sorted((a,b) -> (Integer.parseInt(a.replaceAll("\\D", ""))) -
                        (Integer.parseInt(b.replaceAll("\\D", ""))))
                .collect(Collectors.joining(" "));
    }
}
