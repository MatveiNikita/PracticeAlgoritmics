package Codewars_Learning;

import java.util.Set;
import java.util.stream.Collectors;

public class CountingDuplicates {
    public static void main(String[] args) {
        System.out.println(duplicateCount("aabbcde"));
        String s = "aabbcde";
        Set<Character> charSet = s.chars().mapToObj(e -> (char) e).collect(Collectors.toSet());
        System.out.println(charSet);
    }

    public static long duplicateCount(String text) {
        return text.toLowerCase().chars().mapToObj(e -> (char) e)
                .collect(Collectors.toSet()).stream()
                .filter(c -> text.toLowerCase().indexOf(c) != text.toLowerCase().lastIndexOf(c))
                .count();
    }
}
