package Codewars_Learning;

import java.util.Arrays;

public class PersistentBugger {
    public static void main(String[] args) {
        System.out.println(persistence(999));
    }

    //    public static int persistence(long n) {
//        int count = 0;
//        while (!(n < 10)){
//            String[] numbers = String.valueOf(n).split("");
//            while (numbers.length == 3) {
//                n = Long.parseLong(numbers[0]) * Long.parseLong(numbers[1]) * Long.parseLong(numbers[2]);
//                numbers = String.valueOf(n).split("");
//                count++;
//            }
//            n = Long.parseLong(numbers[0]) * Long.parseLong(numbers[1]);
//            count++;
//        }
//        return count;
//    }
    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) {
            count++;
            n = Arrays.stream(String.valueOf(n).split(""))
                    .limit(String.valueOf(n).length())
                    .mapToLong(Long::parseLong)
                    .reduce(1, (a, b) -> a * b);
        }
        return count;
    }
}

