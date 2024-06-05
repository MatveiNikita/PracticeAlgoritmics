package Codewars_Learning;

import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInYourString {
    public static void main(String[] args) {
        System.out.println(count("aabbbac"));

    }
    public static Map<Character, Integer> count(String str) {
        return str.toLowerCase().chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
    }
}
