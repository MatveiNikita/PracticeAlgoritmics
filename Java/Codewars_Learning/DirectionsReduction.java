package Codewars_Learning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirectionsReduction {
    public static void main(String[] args) {
        String[] blabla = new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"};
        System.out.println(Arrays.toString(dirReduc(blabla)));

    }

    public static String[] dirReduc(String[] arr) {
        List<String> result = new ArrayList<>();
        for (int first = 0; first < arr.length; first++) {
            if (!result.isEmpty() &&
                    ((result.get(result.size() - 1).equals("NORTH") && arr[first].equals("SOUTH"))
                            || (result.get(result.size() - 1).equals("SOUTH") && arr[first].equals("NORTH"))
                            || (result.get(result.size() - 1).equals("WEST") && arr[first].equals("EAST"))
                            || (result.get(result.size() - 1).equals("EAST") && arr[first].equals("WEST"))))
                result.remove(result.size() - 1);
            else result.add(arr[first]);
        }
        return result.toArray(new String[0]);
    }
}
