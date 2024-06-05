package Codewars_Learning;

import java.util.Arrays;

public class CreatePhoneNumber {
    public static void main(String[] args) {
        System.out.println(createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }
    public static String createPhoneNumber(int[] numbers) {
        return Arrays.toString(numbers).replaceAll("\\D", "")
                .replaceAll("(^)(.{3})(.{3})", "$1($2) $3-");
    }
}
