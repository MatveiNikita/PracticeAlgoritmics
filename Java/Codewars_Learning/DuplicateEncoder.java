package Codewars_Learning;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println(encode("SuccesS"));
    }
    static String encode(String word){
        String encode = "";
        Map<Character, Integer> charCounter = word.toLowerCase()
                .chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.summingInt(c -> 1)));
        for (char c : word.toLowerCase().toCharArray()) {
            if (charCounter.get(c) > 1) {
                encode = encode.concat(")");
            } else {
                encode = encode.concat("(");
            }
        }
        return encode;
    }
}
