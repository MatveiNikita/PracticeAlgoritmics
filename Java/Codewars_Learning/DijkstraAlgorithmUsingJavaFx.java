//package Codewars_Learning;
//
//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.stage.Stage;
//
//import java.util.*;
//
//public class DijkstraVisualization extends Application {
//
//    private static final int WIDTH = 800;
//    private static final int HEIGHT = 600;
//
//    @Override
//    public void start(Stage primaryStage) {
//        Map<String, Integer> sashaCosts = new HashMap<>();
//        sashaCosts.put("Dima", 6);
//        sashaCosts.put("Nikita", 2);
//        Map<String, Integer> dimaCosts = new HashMap<>();
//        dimaCosts.put("Daniel", 1);
//        Map<String, Integer> nikitaCosts = new HashMap<>();
//        nikitaCosts.put("Dima", 3);
//        nikitaCosts.put("Daniel", 5);
//
//        Map<String, Map<String, Integer>> nodeAndCosts = new HashMap<>();
//        nodeAndCosts.put("Sasha", sashaCosts);
//        nodeAndCosts.put("Dima", dimaCosts);
//        nodeAndCosts.put("Nikita", nikitaCosts);
//
//        Map<String, String> parents = new HashMap<>();
//        parents.put("Dima", "Sasha");
//        parents.put("Nikita", "Sasha");
//        parents.put("Daniel", "none");
//
//        Map<String, Integer> shortestPath = new HashMap<>();
//        shortestPath.put("Dima", 6);
//        shortestPath.put("Nikita", 2);
//        shortestPath.put("Daniel", Integer.MAX_VALUE);
//
//        List<String> processed = new ArrayList<>();
//
//        Map<String, Integer> finalShortestPath = dijkstraAlgorithm(nodeAndCosts, parents, shortestPath, processed);
//
//        Pane pane = new Pane();
//
//        // Draw nodes
//        Map<String, Double> nodePositions = new HashMap<>();
//        nodePositions.put("Sasha", 100.0);
//        nodePositions.put("Dima", 200.0);
//        nodePositions.put("Nikita", 300.0);
//        nodePositions.put("Daniel", 400.0);
//
//        nodePositions.forEach((nodeName, position) -> {
//            Circle circle = new Circle(position, 100, 10, Color.RED);
//            pane.getChildren().add(circle);
//        });
//
//        // Draw edges
//        nodeAndCosts.forEach((node, neighbors) -> {
//            double startX = nodePositions.get(node);
//            neighbors.forEach((neighbor, cost) -> {
//                double endX = nodePositions.get(neighbor);
//                Line line = new Line(startX, 100, endX, 100);
//                pane.getChildren().add(line);
//            });
//        });
//
//        // Highlight shortest path nodes
//        for (Map.Entry<String, Integer> entry : finalShortestPath.entrySet()) {
//            String node = entry.getKey();
//            double x = nodePositions.get(node);
//            Circle circle = new Circle(x, 100, 12, Color.GREEN);
//            pane.getChildren().add(circle);
//        }
//
//        primaryStage.setScene(new Scene(pane, WIDTH, HEIGHT));
//        primaryStage.setTitle("Dijkstra Visualization");
//        primaryStage.show();
//    }
//
//    public static Map<String, Integer> dijkstraAlgorithm(Map<String, Map<String, Integer>> nodeAndCosts,
//                                                         Map<String, String> parents, Map<String, Integer> shortestPath,
//                                                         List<String> processed) {
//        String node = findLowestCostNode(shortestPath, processed);
//        while (!node.equals("Daniel")) {
//            int cost = shortestPath.get(node);
//            for (Map.Entry<String, Integer> neighbors : nodeAndCosts.get(node).entrySet()) {
//                int newCost = cost + neighbors.getValue();
//                if (shortestPath.get(neighbors.getKey()) > newCost) {
//                    shortestPath.replace(neighbors.getKey(), newCost);
//                    parents.replace(neighbors.getKey(), node);
//                }
//            }
//            processed.add(node);
//            node = findLowestCostNode(shortestPath, processed);
//        }
//        return shortestPath;
//    }
//
//    public static String findLowestCostNode(Map<String, Integer> costs, List<String> processed) {
//        int lowestCost = Integer.MAX_VALUE;
//        String lowestCostNode = "none";
//        for (Map.Entry<String, Integer> entry : costs.entrySet()) {
//            int cost = entry.getValue();
//            if (cost < lowestCost && !processed.contains(entry.getKey())) {
//                lowestCost = cost;
//                lowestCostNode = entry.getKey();
//            }
//        }
//        return lowestCostNode;
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
