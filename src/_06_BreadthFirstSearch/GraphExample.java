package _06_BreadthFirstSearch;

import java.util.*;

public class GraphExample {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        //Create a queue and add the starting node
        Deque<String> searchQueue = new ArrayDeque<>(graph.get("you"));
        List<String> searched = new ArrayList<>();
        while (!searchQueue.isEmpty()){
            String person = searchQueue.pop();
            if (!searched.contains(person)) {
                if (personIsSeller(person)) {
                    System.out.println(person + " is a mango seller!");
                    return;
                }
                searched.add(person);
                searchQueue.addAll(graph.get(person));
            }
        }

        System.out.println("No Mango seller found!");
    }

    private static boolean personIsSeller(String person){
        return person.endsWith("m");
    }
}
