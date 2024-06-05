package Codewars_Learning;
import java.util.stream.IntStream;

public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(122));
    }
    public static int countBits(int n){
        return (int) IntStream.iterate(n, e -> e > 0, e -> e / 2)
                .map(e -> e & 1).filter(e -> e == 1).count();
    }
//        int count = 0;
//        while (n != 0){
//            count += n & 1;
//            n = n / 2;
//        }
//        return count;
//    }
}
