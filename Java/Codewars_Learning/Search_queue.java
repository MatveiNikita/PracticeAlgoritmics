package Codewars_Learning;

import java.util.*;

public class Search_queue {
    public static void main(String[] args) {
        List<String> sashaFriends = new ArrayList<>();
        sashaFriends.add("Dima");
        sashaFriends.add("Oleg");
        sashaFriends.add("Vasea");

        List<String> dimaFriends = new ArrayList<>();
        dimaFriends.add("Masha");
        dimaFriends.add("Alice");

        List<String> olegFriends = new ArrayList<>();
        olegFriends.add("Petya");
        olegFriends.add("Tania");
        List<String> vaseaFriends = new ArrayList<>();
        vaseaFriends.add("Bonea");

        Map<String, List<String>> relationships = new HashMap<>();
        relationships.put("Sasha", sashaFriends);
        relationships.put("Dima", dimaFriends);
        relationships.put("Oleg", olegFriends);
        relationships.put("Vasea", vaseaFriends);

        Queue<String> queue = new LinkedList<>(relationships.get("Sasha"));
        while (!queue.isEmpty()){
            String person = queue.remove();
            if(isNameEndsWithE(person))
                System.out.println(person + " ends with 'e'");
            else queue.addAll(relationships.getOrDefault(person, List.of()));
        }
    }
    public static boolean isNameEndsWithE(String name){
        return name.endsWith("e");
    }
}
