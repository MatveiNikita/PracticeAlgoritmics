package Codewars_Learning;

import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingLetter(""));
    }

    public static String firstNonRepeatingLetter(String s) {
        Map<Character, Long> charCounter = s.toLowerCase()
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        for (int index = 0; index < s.length(); index++) {
            if (charCounter.get(s.toLowerCase().charAt(index)) == 1)
                return String.valueOf(s.charAt(index));
        }

        return "";
    }

}
