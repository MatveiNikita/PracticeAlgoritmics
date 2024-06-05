package Codewars_Learning;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProdFib {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productFib(4895)));
    }

    public static long[] productFib(long prod) {
//        long i = 0, j = 1;
//        while(i * j < prod){
//            i = i + j;
//            j = i + j;
//            if(i * j == prod)
//                return new long[]{i, j, 1};
//            return new long[]{i, j, 0};
//        }
        long i = 0, j = 1;
        while (i * j < prod) {
            i = i + j;
            if (i * j == prod)
                return new long[]{j, i, 1};
            if (i * j > prod)
                return new long[]{j, i, 0};
            j = i + j;
            if (i * j == prod)
                return new long[]{i, j, 1};
            if (i * j > prod)
                return new long[]{i, j, 0};
        }
        return new long[]{0, 0, 0};
    }
}
