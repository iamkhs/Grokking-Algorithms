package _07_DijkstraAlgorithm;

import java.util.*;

public class DijkstraAlgorithm {

    public static void main(String[] args) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6.0);
        graph.get("start").put("b", 2.0);
        graph.put("a", new HashMap<>());
        graph.get("a").put("finish", 1.0);
        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3.0);
        graph.get("b").put("finish", 5.0);
        graph.put("finish", new HashMap<>());

        Map<String, Double> costs = new HashMap<>();
        costs.put("a", 6.0);
        costs.put("b", 2.0);
        costs.put("finish", Double.POSITIVE_INFINITY);

        Map<String, String> parents = new HashMap<>();
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("finish", null);

        Set<String> processed = new HashSet<>();

        String node = findLowestCostNode(costs, processed);
        while (node != null) {
            double cost = costs.get(node);
            Map<String, Double> neighbors = graph.get(node);
            for (String n : neighbors.keySet()) {
                double newCost = cost + neighbors.get(n);
                if (costs.get(n) > newCost) {
                    costs.put(n, newCost);
                    parents.put(n, node);
                }
            }
            processed.add(node);
            node = findLowestCostNode(costs, processed);
        }

        System.out.println("Shortest path: " + getPath(parents, "finish"));
    }

    private static String findLowestCostNode(Map<String, Double> costs, Set<String> processed) {
        double lowestCost = Double.POSITIVE_INFINITY;
        String lowestCostNode = null;
        for (String node : costs.keySet()) {
            double cost = costs.get(node);
            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }
        return lowestCostNode;
    }

    private static List<String> getPath(Map<String, String> parents, String node) {
        List<String> path = new ArrayList<>();
        path.add(node);
        while (parents.get(node) != null) {
            node = parents.get(node);
            path.add(0, node);
        }
        return path;
    }
}

