package Codewars_Learning;

import java.util.*;
import java.util.stream.Collectors;

public class TheObservedPIN {
    public static void main(String[] args) {
        System.out.println(getPINs("369"));
    }

    public static List<String> getPINs(String observed) {
        if (observed.isEmpty() || observed == null) return new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();
        List<Integer> generatedCombination = new ArrayList<>();
        Set<String> result = new TreeSet<>();

        for (char number : observed.replaceAll("\\D", "").toCharArray())
            numbers.add(Integer.parseInt(String.valueOf(number)));
        for (Integer number : numbers)
            combinationGenerator(number, generatedCombination);

        for (int i = 0; i < generatedCombination.size(); i++) {
            for (int j = 1; j < generatedCombination.size(); j += numbers.size() - 1) {
                if(numbers.size() == 1)
                    return generatedCombination.stream().map(String::valueOf).collect(Collectors.toList());
                if (numbers.size() == 2) {
                    result.add(String.valueOf(generatedCombination.get(i))
                            .concat(String.valueOf(generatedCombination.get(j))));
                } else
                    for (int k = 2; k < generatedCombination.size(); k++) {
                        result.add(String.valueOf(generatedCombination.get(i))
                                .concat(String.valueOf(generatedCombination.get(j)))
                                .concat(String.valueOf(generatedCombination.get(k))));
                    }
            }
        }

        return result.stream().map(String::valueOf).collect(Collectors.toList());
    }

    public static void combinationGenerator(int number, List<Integer> generatedCombination) {
        switch (number) {
            case 0 -> generatedCombination.addAll(Arrays.asList(0, 8));
            case 1 -> generatedCombination.addAll(Arrays.asList(1, 2, 4));
            case 2 -> generatedCombination.addAll(Arrays.asList(1, 2, 3, 5));
            case 3 -> generatedCombination.addAll(Arrays.asList(2, 3, 6));
            case 4 -> generatedCombination.addAll(Arrays.asList(1, 4, 5, 7));
            case 5 -> generatedCombination.addAll(Arrays.asList(2, 4, 5, 6, 8));
            case 6 -> generatedCombination.addAll(Arrays.asList(3, 5, 6, 9));
            case 7 -> generatedCombination.addAll(Arrays.asList(4, 7, 8));
            case 8 -> generatedCombination.addAll(Arrays.asList(5, 7, 8, 9, 0));
            case 9 -> generatedCombination.addAll(Arrays.asList(6, 8, 9));
            default -> {
            }
        }
    }
}


//       if (numbers.size() <= 2) {
//               for (int i = 0; i < generatedCombination.size(); i++) {
//        for (int j = 1; j < generatedCombination.size(); j++) {
//        result.add(String.valueOf(generatedCombination.get(i))
//        .concat(String.valueOf(generatedCombination.get(j))));
//        }
//        }
//        } else
//        for (int i = 0; i < generatedCombination.size(); i++) {
//        for (int j = 1; j < generatedCombination.size(); j++) {
//        for (int k = 2; k < generatedCombination.size(); k++) {
//        result.add(String.valueOf(generatedCombination.get(i))
//        .concat(String.valueOf(generatedCombination.get(j)))
//        .concat(String.valueOf(generatedCombination.get(k))));
//        }
//        }
//        }



