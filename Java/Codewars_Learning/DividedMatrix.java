package Codewars_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DividedMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(7, 11, 9, 9, 11, 3));
        matrix.add(Arrays.asList(8, 9, 3, 4, 0, 13));
        matrix.add(Arrays.asList(3, 10, 4, 14, 3, 7));
        matrix.add(Arrays.asList(4, 15, 5, 6, 3, 9));
        matrix.add(Arrays.asList(3, 12, 3, 12, 8, 0));
        matrix.add(Arrays.asList(17, 4, 2, 4, 14, 3));
        System.out.println(calculateMatrix(matrix));

    }

    public static List<Integer> calculateMatrix(List<List<Integer>> matrix) {
        int p1 = 0, p2 = 0, p3 = 0, p4 = 0;

        for (int i = 1, j = matrix.size() - 1; i < j; i++)
            p1 += matrix.get(i).get(0);
        for (int k = 2, h = matrix.size() - k; k < h; k++)
            p1 += matrix.get(k).get(1);

        for (int i = 1, j = matrix.size() - 1; i < j; i++)
            p2 += matrix.get(0).get(i);
        for (int k = 2, h = matrix.size() - k; k < h; k++)
            p2 += matrix.get(1).get(k);

        for (int i = 1, j = matrix.size() - 1; i < j; i++)
            p3 += matrix.get(i).get(j);
        for (int k = 2, h = matrix.size() - k; k < h; k++)
            p3 += matrix.get(k).get(h);

        for (int i = 1, j = matrix.size() - 1; i < j; i++)
            p4 += matrix.get(j).get(i);
        for (int k = 2, h = matrix.size() - k; k < h; k++)
            p4 += matrix.get(h).get(k);

        return Arrays.asList(p1, p2, p3, p4);
    }
}
