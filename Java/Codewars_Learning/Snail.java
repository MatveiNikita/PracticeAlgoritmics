package Codewars_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Snail {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(snail(new int[][]{{1, 2, 3, 10, 20},
                {4, 5, 6, 11, 25},
                {7, 8, 9, 12, 26},
                {7, 8, 9, 12, 17}})));
    }

    public static int[] snail(int[][] array) {
        if (array.length == 0) return new int[0];
        List<Integer> result = new ArrayList<>();
        int startColumn = 0, endColumn = array[0].length - 1;
        int startRow = 0, endRow = array.length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {
            result.addAll(forward(startColumn, endColumn, startRow, array));
            startRow++;
            result.addAll(toDown(startRow, endRow, endColumn, array));
            endColumn--;
            if (startRow <= endRow) {
                result.addAll(backward(endColumn, startColumn, endRow, array));
                endRow--;
            }
            if (startColumn <= endColumn) {
                result.addAll(toUp(endRow, startRow, startColumn, array));
                startColumn++;
            }
        }
        return result.stream().mapToInt(e -> e).toArray();
    }

    public static List<Integer> forward(int startColumn, int endColumn, int startRow, int[][] array) {
        List<Integer> resultForward = new ArrayList<>();
        while (startColumn <= endColumn) {
            resultForward.add(array[startRow][startColumn]);
            startColumn++;
        }
        return resultForward;
    }

    public static List<Integer> toDown(int startRow, int endRow, int endColumn, int[][] array) {
        List<Integer> resultToDown = new ArrayList<>();
        while (startRow <= endRow) {
            resultToDown.add(array[startRow][endColumn]);
            startRow++;
        }
        return resultToDown;
    }

    public static List<Integer> backward(int endColumn, int startColumn, int endRow, int[][] array) {
        List<Integer> resultBackward = new ArrayList<>();
        while (endColumn >= startColumn) {
            resultBackward.add(array[endRow][endColumn]);
            endColumn--;
        }
        return resultBackward;
    }

    public static List<Integer> toUp(int endRow, int startRow, int startColumn, int[][] array) {
        List<Integer> resultToUp = new ArrayList<>();
        while (endRow >= startRow) {
            resultToUp.add(array[endRow][startColumn]);
            endRow--;
        }
        return resultToUp;
    }
}
