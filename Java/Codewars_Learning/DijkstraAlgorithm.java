package Codewars_Learning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DijkstraAlgorithm {
    public static void main(String[] args) {

        Map<String, Integer> sashaCosts = new HashMap<>(Map.of("Dima", 66, "Nikita", 22));
        Map<String, Integer> dimaCosts = new HashMap<>(Map.of("Daniel", 1,"Nikita", 7 ));
        Map<String, Integer> nikitaCosts = new HashMap<>(Map.of("Dima", 3, "Daniel", 5, "Vasea", 1));
        Map<String, Integer> vaseaCosts = new HashMap<>(Map.of("Petya", 3));
        Map<String, Integer> petyaCosts = new HashMap<>(Map.of("Daniel", 7));
        Map<String, Integer> danielCosts = new HashMap<>(Map.of("none", Integer.MAX_VALUE));

        Map<String, Integer> costs = new HashMap<>(Map.of("Dima", 66, "Nikita", 22,
                "Vasea", Integer.MAX_VALUE, "Petya", Integer.MAX_VALUE, "Daniel", Integer.MAX_VALUE));

        Map<String, Map<String, Integer>> nodeAndCosts = new HashMap<>(Map.of("Sasha", sashaCosts,
                "Dima", dimaCosts, "Nikita", nikitaCosts, "Vasea",
                vaseaCosts, "Petya", petyaCosts, "Daniel", danielCosts));
        Map<String, String> parents = new HashMap<>(Map.of("Dima", "Sasha", "Nikita",
                "Sasha", "Daniel", "none"));
        List<String> processed = new ArrayList<>();

        System.out.println(dijkstraAlgorithm(nodeAndCosts, parents, costs, processed));
    }

    public static Map<String, Integer> dijkstraAlgorithm(Map<String, Map<String, Integer>> nodeAndCosts,
                                                         Map<String, String> parents, Map<String, Integer> shortestPath,
                                                         List<String> processed) {
        String node = findLowestCostNode(shortestPath, processed);
        while (!node.equals("Daniel")) {
            int cost = shortestPath.get(node);
            for (Map.Entry<String, Integer> neighbors : nodeAndCosts.get(node).entrySet()) {
                int newCost = cost + neighbors.getValue();
                if (shortestPath.get(neighbors.getKey()) > newCost) {
                    shortestPath.replace(neighbors.getKey(), newCost);
                    parents.replace(neighbors.getKey(), node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(shortestPath, processed);
        }
        return shortestPath;
    }

    public static String findLowestCostNode(Map<String, Integer> costs, List<String> processed) {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = "none";
        for (Map.Entry<String, Integer> entry : costs.entrySet()) {
            int cost = entry.getValue();
            if (cost <= lowestCost && !processed.contains(entry.getKey())) {
                lowestCost = cost;
                lowestCostNode = entry.getKey();
            }
        }
        return lowestCostNode;
    }
}
