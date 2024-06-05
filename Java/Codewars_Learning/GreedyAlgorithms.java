package Codewars_Learning;

import java.util.*;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        Set<String> koneStateCoverage = new HashSet<>(Set.of("id", "nv", "ut"));
        Set<String> ktwoStateCoverage = new HashSet<>(Set.of("wa", "id", "mt"));
        Set<String> kthreeStateCoverage = new HashSet<>(Set.of("or", "nv", "ca"));
        Set<String> kfourStateCoverage = new HashSet<>(Set.of("nv", "ut"));
        Set<String> kfiveStateCoverage = new HashSet<>(Set.of("ca", "az"));

        Map<String, Set<String>> stations = new HashMap<>(Map.of(
                "kone", koneStateCoverage, "ktwo", ktwoStateCoverage, "kthree", kthreeStateCoverage,
                "kfour", kfourStateCoverage, "kfive", kfiveStateCoverage));
        System.out.println(getBestCoverage(stations));
    }

    public static Set<String> getBestCoverage(Map<String, Set<String>> stationsAndStates) {
        Set<String> bestCoverageStation = new HashSet<>();
        Set<String> statesCoverageNeeded = new HashSet<>();
        for (Map.Entry<String, Set<String>> entry : stationsAndStates.entrySet())
            statesCoverageNeeded.addAll(entry.getValue());
        
        while (!statesCoverageNeeded.isEmpty()) {
            String bestStation = "None";
            Set<String> statesCovered = new HashSet<>();
            for (Map.Entry<String, Set<String>> entry : stationsAndStates.entrySet()) {
                Set<String> covered = new HashSet<>(entry.getValue());
                covered.retainAll(statesCoverageNeeded);
                if (covered.size() > statesCovered.size()) {
                    bestStation = entry.getKey();
                    statesCovered = covered;
                }
            }
            statesCoverageNeeded.removeAll(statesCovered);
            bestCoverageStation.add(bestStation);
        }
        return bestCoverageStation;
    }
}
