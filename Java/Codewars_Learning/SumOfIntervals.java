package Codewars_Learning;
import java.util.*;
public class SumOfIntervals {
    public static void main(String[] args) {
        System.out.println(sumIntervals(new int[][]{}));
    }

    public static int sumIntervals(int[][] intervals) {
        if(intervals.length == 0)
            return 0;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        merged.add(intervals[0]);

        // Merge overlapping intervals
        for (int i = 1; i < intervals.length; i++) {
            int[] current = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            if (current[0] <= lastMerged[1]) {
                lastMerged[1] = Math.max(current[1], lastMerged[1]);
            } else {
                merged.add(current);
            }
        }

        // Calculate the sum of merged intervals
        int sum = 0;
        for (int[] interval : merged) {
            sum += interval[1] - interval[0];
        }

        return sum;
    }
}
