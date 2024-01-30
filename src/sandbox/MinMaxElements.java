package sandbox;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class MinMaxElements {
    public static void main(String[] args) {
        int[] arr = {2};

        Arrays.stream(minMaxStream(arr)).forEach(System.out::print);

    }

    public static int[] minMax(int[] arr) {

        int max = 0;
        int min = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                min = max;
            }
            if (min > arr[i]) {
                min = arr[i];
            }

        }
        return new int[]{max, max};
    }

    public static int[] minMaxStream(int[] arr) {
        return new int[]{
                Arrays.stream(arr).min().getAsInt(),
                Arrays.stream(arr).max().getAsInt()};
    }
}
